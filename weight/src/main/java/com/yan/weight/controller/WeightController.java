package com.yan.weight.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.yan.weight.schema.Weight;
import com.yan.weight.service.facade.WeightDaoService;
import com.yan.weight.vo.RequestVo;
import com.yan.weight.vo.ResponseVo;


@RestController
public class WeightController {
	
	@Autowired
	private WeightDaoService weightDaoService;
	

	@RequestMapping("/weight/weightIndex")
	public ModelAndView weightMain() throws Exception {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("weightMain");
		return mav;
	}
	
	// #####################################################################################################
	// 以上是mvc的页面跳转部分<以下是RESTful的api
	// #####################################################################################################
	
	
	@RequestMapping(value = "/weight/api/weight",method = RequestMethod.POST, consumes="application/json")
	public ResponseVo saveWeight(@RequestBody Weight weight){
		ResponseVo responseVo = new ResponseVo();
		responseVo.setSuccess(false);
		responseVo.setErrorMsg(null);
		
		if(weight != null){
			
			weightDaoService.insertWeight(weight);
			
			responseVo.setSuccess(true);
			responseVo.setErrorMsg(null);
			
			responseVo.setWeight(weight);
		}
		
		return responseVo;
	}
	
	@RequestMapping(value = "/weight/api/weight/{id}",method = RequestMethod.GET,consumes="application/json")
	public ResponseVo queryWeight(@PathVariable String id) throws JsonProcessingException {
		ResponseVo responseVo = new ResponseVo();
		responseVo.setSuccess(false);
		responseVo.setErrorMsg(null);
		
		if(id != null && !"".equals(id.trim())) {
			Weight weight = weightDaoService.queryWeightById(Integer.parseInt(id));
			responseVo.setSuccess(true);
			responseVo.setErrorMsg(null);
			
			responseVo.setWeight(weight);
			
		}
//		else{
//			
//			int total = weightDaoService.countWeight();
//			List<Weight> weights = weightDaoService.queryWeights();
//			
//			responseVo.setSuccess(true);
//			responseVo.setErrorMsg(null);
//			
//			responseVo.setTotal(total);
//			responseVo.setWeights(weights);
//		}
		
		return responseVo;
	}
	
	@RequestMapping(value = "/weight/api/weights",method = RequestMethod.GET,consumes="application/json")
	public ResponseVo queryWeights(@RequestParam String userId) throws JsonProcessingException {
		ResponseVo responseVo = new ResponseVo();
		responseVo.setSuccess(false);
		responseVo.setErrorMsg(null);

		Map<String, Object> condition = new HashMap<String, Object>();
		if(userId != null && !"".equals(userId.trim())){
			condition.put("userId", userId);
		}
		
		int total = weightDaoService.countWeight(condition);
		List<Weight> weights = weightDaoService.queryWeights(condition);
		
		responseVo.setSuccess(true);
		responseVo.setErrorMsg(null);
		
		responseVo.setTotal(total);
		responseVo.setWeights(weights);
		
		return responseVo;
	}
	
	@RequestMapping(value = "/weight/datagrid", method = RequestMethod.POST,consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	public ResponseVo queryWeights(@CookieValue(value="userId",required=false) String userId, RequestVo requestVo) throws JsonProcessingException {
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
		condition.put("rows", pageSize);
		
		int total = weightDaoService.countWeight(condition);
		List<Weight> weights = weightDaoService.queryWeightsAndPaging(condition);
		
		responseVo.setSuccess(true);
		responseVo.setErrorMsg(null);
		
		responseVo.setTotal(total);
		responseVo.setRows(weights);
		
		return responseVo;
	}
}