package com.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.dao.LoginDAO;

@Controller
public class LoginController {

	@RequestMapping("/loginPage.htm")
	public ModelAndView displayLoginPage() throws Exception
	{
		System.out.println("Hello");
		ModelAndView mView=new ModelAndView();
		mView.setViewName("/login.jsp");
		return mView;
		
	}
	
	@RequestMapping("/login.htm")
	public ModelAndView validateUser(HttpServletRequest request) throws Exception
	{
		String uname=request.getParameter("uname");
		String pass=request.getParameter("pass");
		
		ModelAndView mView=new ModelAndView();
		
		LoginDAO login=new LoginDAO();
		boolean status=login.authenticate(uname, pass);
		
		if (status) {
			
			mView.addObject("USERNAME",uname);
			mView.setViewName("/success.jsp");
		} else {
			mView.addObject("ERROR","INVALID USERNAME OR PASSWORD");
			mView.setViewName("/failure.jsp");
		}
		return mView;
	}
}
