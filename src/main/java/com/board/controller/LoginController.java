package com.board.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

public class LoginController {


    @RequestMapping(value = "login.do", method = RequestMethod.POST)
    public ModelAndView login(HttpServletRequest request,HttpServletResponse response) {

    	
    	HttpSession session = request.getSession();
        session.setAttribute("userName", null);

        ModelAndView mav = new ModelAndView();
        mav.setViewName("gretBoardList.do");
        
        return mav;

    }

    @RequestMapping(value = "logout.do", method = RequestMethod.POST)
    public ModelAndView logOut(HttpServletRequest request,HttpServletResponse response) {
    	
    	HttpSession session = request.getSession();
        session.invalidate();

        ModelAndView mav = new ModelAndView();
        mav.setViewName("redirect:login.jsp");//redirect를 붙이면 ViewResolver 동작X?
        
        return mav;

    }

}
