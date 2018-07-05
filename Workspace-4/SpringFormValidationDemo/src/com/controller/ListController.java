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
import com.dao.LoginDAO;
import com.pojo.Employee;
import com.pojo.Login;

@Controller
public class ListController {
	
	@Autowired
	private LoginDAO loginDAO;
	
	@RequestMapping("/displayList.htm")
	public ModelAndView displayLoginPage(HttpServletRequest request,HttpServletResponse response, ModelMap map) throws Exception
	{	
		List<Employee>empList=new ArrayList<Employee>();
		Employee e1=new Employee();
		e1.setEmpId(100);
		e1.setEmpName("Jack");
		e1.setSalary(20000);
		Employee e2=new Employee();
		e2.setEmpId(101);
		e2.setEmpName("Mark");
		e1.setSalary(35000);
		empList.add(e1);
		empList.add(e2);
		ModelAndView mView=new ModelAndView();
		mView.addObject("employeeList",empList);
		mView.setViewName("/listDisplay");
		return mView;
		
	}


}
