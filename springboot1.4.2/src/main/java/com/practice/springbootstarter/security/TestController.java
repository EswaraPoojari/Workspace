package com.practice.springbootstarter.security;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/")
	public String hello(){
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		System.out.println("User: "+authentication.getName());
		System.out.println("Roles: "+authentication.getAuthorities());
		return "Hello";
	}
}
