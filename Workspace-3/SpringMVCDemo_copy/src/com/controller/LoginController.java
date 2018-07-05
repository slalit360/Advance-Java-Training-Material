package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class LoginController {
		
	@RequestMapping("/loginPage.htm")
	public ModelAndView displayLoginPage(HttpServletRequest request,HttpServletResponse response) throws Exception
	{
		ModelAndView mView=new ModelAndView();
		mView.setViewName("/login");
		return mView;
	}
	
	
	@RequestMapping("/login.htm")
	public ModelAndView validateUser(HttpServletRequest request,HttpServletResponse response) throws Exception
	{
		String userName=request.getParameter("uName");
		String password=request.getParameter("pwd");
		ModelAndView mView=new ModelAndView();
		
		boolean status=false;
		if(userName.equals("System") && password.equals("admin")){
			status=true;
		}else{
			status=false;
		}
		
		if(status){
			mView.addObject("USERNAME", userName);
			mView.setViewName("/success");
		}else{
			mView.addObject("ERROR", "Invalid Credentials");
			mView.setViewName("/failure");
		}
		return mView;
	}


}
