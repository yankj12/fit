package com.yan.fitness.history.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FitnessHistoryController {

	
	@RequestMapping(value = {"/", "/index"})
	public String index(){
		return "fitnessHistoryMain";
	}
}
