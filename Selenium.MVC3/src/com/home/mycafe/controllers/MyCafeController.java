package com.home.mycafe.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyCafeController {
   
	//returns the welcome page only
	@RequestMapping("/cafe")
	public String showWelcomePage(Model model){
		
		
		return "welcom-page";
	}
	
	@RequestMapping("/processOrder")
	public String process(HttpServletRequest request,Model model){
		
		String data = request.getParameter("foodType");
		
		model.addAttribute("key1",data);
		return "process-order";
	}
}
