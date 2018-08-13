package com.sanyang.logistics03.grasenyu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginHandler {
	
	@RequestMapping("/login")
	public String login(String users ,String pwd) {
		System.out.println(1);
		System.out.println(users);
		System.out.println(pwd);
		String user ="admin";
		String password ="admin";       

		if (users.equals(user)&&pwd.equals(password)) {
			return "redirect:index.jsp";
		}else {
			return "redirect:login";
		
		}
		
		
		
		
		
	}
}
