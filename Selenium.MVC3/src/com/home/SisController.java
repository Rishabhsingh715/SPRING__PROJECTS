package com.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/sis")
public class SisController {
    
	@ResponseBody
	@RequestMapping("/kit")
	public String getKit(){
		
		return "Here Take the makeup kit";
	}
	
	@ResponseBody
	@RequestMapping("/book")	
public String getBook(){
		
		return "Here Take the math book";
	}
}
