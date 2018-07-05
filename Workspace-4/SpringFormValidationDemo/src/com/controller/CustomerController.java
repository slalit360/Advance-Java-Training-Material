package com.controller;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.pojo.Country;
import com.pojo.Customer;
import com.pojo.Gender;
import com.pojo.Login;


@Controller
public class CustomerController {
	
	@RequestMapping("/customerRegistration.htm")
	public ModelAndView displayLoginPage(HttpServletRequest request,HttpServletResponse response, ModelMap map) throws Exception
	{	
		Customer customer=new Customer();
		map.addAttribute(customer);
		ModelAndView mView=new ModelAndView();
		mView.setViewName("/registration");
		return mView;
		
	}
	
	@ModelAttribute("countryList")
	public List<Country> populateCountry() {
		List<Country> countryList = new ArrayList<Country>();
		Country c1 = new Country();
		c1.setCountryId(100);
		c1.setCountryName("India");
		countryList.add(c1);
		
		Country c2 = new Country();
		c2.setCountryId(200);
		c2.setCountryName("Others");
		countryList.add(c2);
		
		return countryList;
	}
	
	@ModelAttribute("genderList")
	public List<Gender> populateGender() {
		List<Gender> genderList = new ArrayList<Gender>();
		Gender g1=new Gender();
		g1.setId(1);
		g1.setDescription("Male");
		genderList.add(g1);
		
		Gender g2=new Gender();
		g2.setId(2);
		g2.setDescription("Female");
		genderList.add(g2);
		
		return genderList;
	}
	
	@RequestMapping(value="/registration.htm",method=RequestMethod.GET)
	public ModelAndView validateUser(@ModelAttribute Customer customer)throws Exception{ 
		ModelAndView mView=new ModelAndView();
		mView.addObject("CustomerName", customer.getCustomerName());
		mView.addObject("Country", customer.getCountry());
		mView.addObject("Gender", customer.getGender());
		mView.addObject("CustomerId", customer.getCustomerId());
		mView.setViewName("/registerSuccess");
		return mView;
	}

}
