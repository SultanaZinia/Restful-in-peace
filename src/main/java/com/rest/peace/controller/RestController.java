package com.rest.peace.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.SessionAttributes;


@Controller
@SessionAttributes("organization")

public class RestController {
	
	@RequestMapping("/")
	public String showHello(){
		//System.out.println("Spring - Great Web Hello Controller!");
		return "Hello World";
	}
	
	

}
