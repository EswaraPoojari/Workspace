package com.practice.springbootstarter.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

	@RequestMapping("/")
	public String handler1(Model model){
		model.addAttribute("msg", "a jar packaging example");
		return "myview";
	}
	
	@RequestMapping("/test2")
	public String handler2(Model model){
		model.addAttribute("msg", "Message from /test2");
		return "test2";
	}
}
