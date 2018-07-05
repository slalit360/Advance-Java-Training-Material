package com.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
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
	
	//@Autowired @Qualifier("validator")
	//private Validator validator;
	
	@RequestMapping("/loginPage.htm")
	public ModelAndView displayLoginPage() throws Exception
	{	
		Login login=new Login();
		ModelAndView mView=new ModelAndView();
		mView.addObject("loginForm",login);
		mView.setViewName("/login");
		
		return mView;
		
	}
	
	/*@RequestMapping(value="/loginPage.htm",method=RequestMethod.GET)
	public String register(Map<String,Object> map)
	{
		Login login=new Login();
		map.put("loginForm",login);
		return "login";//view name
	}*/
	
	
	@RequestMapping(value="/login.htm",method=RequestMethod.POST)
	public ModelAndView validateUser(@Valid@ModelAttribute("loginForm") Login login,BindingResult result)throws Exception{ 
		
		ModelAndView mView=new ModelAndView();
		
		//validator.validate(login, result);
		
		System.out.println(result);
			
		if(result.hasErrors()){
			mView.setViewName("/login");
			return mView;
		}
		
		String userName=login.getUserName();
	    String password=login.getPassword();
		
		boolean status=loginDAO.validateUser(userName,password);
		
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
