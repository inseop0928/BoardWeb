package com.board.controller;

import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class LoginController {

	
	@RequestMapping(value ="login.do", method =RequestMethod.POST)
	public String login(HttpSession session) {
		
		session.setAttribute("userName", null);
		
		
		return null;
		
	}
	
	@RequestMapping(value ="logout.do",method =RequestMethod.POST)
	public String logOut(HttpSession session) {
		
		session.invalidate();
		
		return null;
		
	}
	
}
