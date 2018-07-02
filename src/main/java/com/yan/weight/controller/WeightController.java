package com.yan.weight.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.yan.weight.schema.Weight;
import com.yan.weight.service.facade.WeightDaoService;
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
	
	
	@RequestMapping(value = "/weight/api/weight",method = RequestMethod.PUT, consumes="application/json")
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
	public ResponseVo queryWeight() throws JsonProcessingException {
		ResponseVo responseVo = new ResponseVo();
		responseVo.setSuccess(false);
		responseVo.setErrorMsg(null);

		int total = weightDaoService.countWeight();
		List<Weight> weights = weightDaoService.queryWeights();
		
		responseVo.setSuccess(true);
		responseVo.setErrorMsg(null);
		
		responseVo.setTotal(total);
		responseVo.setWeights(weights);
		
		return responseVo;
	}
}