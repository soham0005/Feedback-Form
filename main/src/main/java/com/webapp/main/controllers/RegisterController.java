package com.webapp.main.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.webapp.main.repo.AgentRepo;
import com.webapp.model.Agent;



@Controller
public class RegisterController {
	
	@Autowired
	AgentRepo repo;
	
	@RequestMapping("register")
	public ModelAndView register() {
		ModelAndView mv = new ModelAndView();
		System.out.println("Register Controller Executed");
		mv.setViewName("register");
		return mv;
	}
	
	@RequestMapping("/addAgent")
	public ModelAndView addAgent(Agent agent) {
		ModelAndView mv = new ModelAndView();
		System.out.println("Inside /addAgent Controller");
		repo.save(agent);
		mv.setViewName("sucess");
		return mv;
	}

}
