package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.dao.LoginDAO;
import com.pojo.Login;

@Controller
public class LoginController {
	
	@Autowired
	private LoginDAO loginDAO;
	
	@RequestMapping("/loginPage.htm")
	public ModelAndView displayLoginPage(ModelMap map) throws Exception
	{	
		Login login1=new Login();
		//login.setUserName(100);
		map.addAttribute(login1);
		ModelAndView mView=new ModelAndView();
		mView.setViewName("/login");
		return mView;
		
	}
	
	
	@RequestMapping(value="/login.htm",method=RequestMethod.POST)
	public ModelAndView validateUser(@ModelAttribute Login login)throws Exception{ 
		
		String userName=login.getUserName();
	    String password=login.getPassword();
		
		boolean status=loginDAO.validateUser(userName,password);
		
		ModelAndView mView=new ModelAndView();
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
