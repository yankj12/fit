package com.yan.fitness.history.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.yan.fitness.history.mapper.FitnessHistoryDaoService;
import com.yan.fitness.history.schema.FitnessHistory;
import com.yan.fitness.history.vo.RequestVo;
import com.yan.fitness.history.vo.ResponseVo;

@CrossOrigin
@RestController
public class FitnessHistoryRestController {
		
	@Autowired
	private FitnessHistoryDaoService fitnessHistoryDaoService;
		
	@RequestMapping(value = "/api/fitnesshistories/datagrid", method = RequestMethod.POST,consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	public ResponseVo queryFitnessHistories(@CookieValue(value="userId",required=false) String userId, RequestVo requestVo) throws JsonProcessingException {
		ResponseVo responseVo = new ResponseVo();
		responseVo.setSuccess(false);
		responseVo.setErrorMsg(null);

		Map<String, Object> condition = new HashMap<String, Object>();
		if(userId != null && !"".equals(userId.trim())){
			condition.put("userId", userId.trim());
		}
		
		int pageNo = 1;
		if(requestVo != null && requestVo.getPage() != null && requestVo.getPage() >= 1){
			pageNo = requestVo.getPage();
		}
		
		int pageSize = 10;
		if(requestVo != null && requestVo.getRows() != null && requestVo.getRows() >= 0){
			pageSize = requestVo.getRows();
		}
		
		int offset = (pageNo-1)*pageSize;
		
		//第一个参数指定第一个返回记录行的偏移量，第二个参数指定返回记录行的最大数目。初始记录行的偏移量是 0(而不是 1)
		condition.put("offset", offset);
		condition.put("pageSize", pageSize);
		
		int total = fitnessHistoryDaoService.countFitnessHistory(condition);
		List<FitnessHistory> fitnessHistories = fitnessHistoryDaoService.findFitnessHistoriesAndPaging(condition);
		
		responseVo.setSuccess(true);
		responseVo.setErrorMsg(null);
		
		responseVo.setTotal(total);
		responseVo.setRows(fitnessHistories);
		
		return responseVo;
	}
	
	
	@RequestMapping(value = "/api/fitnesshistories/{id}",method = RequestMethod.GET,consumes="application/json")
	public ResponseVo queryFitnessHistory(@PathVariable String id) throws JsonProcessingException {
		ResponseVo responseVo = new ResponseVo();
		responseVo.setSuccess(false);
		responseVo.setErrorMsg(null);
		
		if(id != null && !"".equals(id.trim())) {
			FitnessHistory fitnessHistory = fitnessHistoryDaoService.findFitnessHistoriesById(Integer.parseInt(id));
			responseVo.setSuccess(true);
			responseVo.setErrorMsg(null);
			
			responseVo.setObject(fitnessHistory);
			
		}
		
		return responseVo;
	}
	
	@RequestMapping(value = "/api/fitnesshistories",method = RequestMethod.POST, consumes="application/json")
	public ResponseVo saveFitnessHistory(@RequestBody FitnessHistory fitnessHistory){
		ResponseVo responseVo = new ResponseVo();
		responseVo.setSuccess(false);
		responseVo.setErrorMsg(null);
		
		if(fitnessHistory != null){
			
			fitnessHistoryDaoService.insertFitnessHistory(fitnessHistory);
			
			responseVo.setSuccess(true);
			responseVo.setErrorMsg(null);
			
			responseVo.setObject(fitnessHistory);
		}
		
		return responseVo;
	}
	
}