package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bean.LoginBean;
import com.dao.LoginDAO;


@Controller
public class LoginController {
	
	@Autowired
	private LoginDAO loginDAO;
	
	@RequestMapping("/loginPage.htm")
	public ModelAndView displayLoginPage(ModelMap map) throws Exception
	{
		LoginBean login=new LoginBean();
		map.addAttribute(login);
		ModelAndView mView=new ModelAndView();
		mView.setViewName("/login");
		return mView;
	}
	
	
	@RequestMapping("/login.htm")
	public ModelAndView validateUser(@ModelAttribute LoginBean login) throws Exception
	{
	
		ModelAndView mView=new ModelAndView();
		
		boolean status=loginDAO.validateUser(login);
		
		if(status){
			mView.addObject("USERNAME", login.getUserName());
			mView.setViewName("/success");
		}else{
			mView.addObject("ERROR", "Invalid Credentials");
			mView.setViewName("/failure");
		}
		return mView;
	}


}
