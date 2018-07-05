package com.controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.dao.ProductDAO;
import com.pojo.Product;
import com.pojo.ProductId;

@Controller
public class ProductController {
	
	@Autowired
	ProductDAO dao;

	@RequestMapping("/newProduct.htm")
	public ModelAndView newProduct(ModelMap map) throws Exception
	{	
		Product p=new Product();
		map.addAttribute(p);
		ModelAndView mView=new ModelAndView();
		mView.setViewName("./addProduct");
		return mView;
		
	}
	
	@RequestMapping("/addProduct1.htm")
	public ModelAndView addProduct(@ModelAttribute Product product)
	{
		/*int pid=product.getpId();
		String pname=product.getpName();
		double price=product.getPrice();*/
		
		//ProductDAO dao=new ProductDAO();
				
		boolean status = false;
		try {
			status = dao.addProductDao(product);
		} catch (Exception e) {
			System.out.println(e);
		}
		
		ModelAndView mView=new ModelAndView();
		
		if(status){
			mView.addObject("ERROR","Product Added Successfully!!" );
		}else{
			mView.addObject("ERROR", "Product Adding Failed");
		}
		
		mView.setViewName("./addProduct");
		return mView;
		
	}
	
	
	/*@RequestMapping("/loading.htm")
	public ModelAndView loading()
	{
		
		ModelAndView mView=new ModelAndView();
		
		mView.setViewName("./updateProduct");
		return mView;
		
	}*/
	
	@ModelAttribute("productList")
	public List<ProductId> populateList() 
	{
		List<ProductId> pList = new ArrayList<ProductId>();
		try {
			pList = dao.getupdateProductList();
		} catch (SQLException e) {
			
			System.out.println(e);
		}
		
		return pList;
	}
	
	@RequestMapping("/updateProduct1.htm")
	public ModelAndView updateProduct(@ModelAttribute Product product)
	{
				
		boolean status = false;
		try {
			status = dao.updateProductDao(product);
		} catch (Exception e) {
			System.out.println(e);
		}
		
		ModelAndView mView=new ModelAndView();
		
		if(status){
			mView.addObject("ERROR","Product Updated Successfully!!" );
		}else{
			mView.addObject("ERROR", "Product Updated Failed");
		}
		
		mView.setViewName("./updateProduct");
		return mView;
		
	}
	
	@RequestMapping("/displayProduct.htm")
	public ModelAndView listProduct()
	{
				
		List<Product> pList = new ArrayList<Product>();
		try {
			pList = dao.getProductList();
		} catch (SQLException e) {
			
			System.out.println(e);
		}
		ModelAndView mView=new ModelAndView();
		mView.addObject("pList",pList);
		mView.setViewName("./listDisplay");
		return mView;
		
	}
	
	
	
	
}
