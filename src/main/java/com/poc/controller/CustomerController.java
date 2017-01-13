package com.poc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.poc.entity.CustomerEntity;
import com.poc.service.CustomerService;

@Controller
@RequestMapping(value="/customer")
public class CustomerController {
	
	@Autowired
	CustomerService custserv;
	
	@RequestMapping(value={"","/"})
	public String showCust(ModelMap model)
	{
		model.addAttribute("cust", new CustomerEntity());
		return "customer";
	}
	
	@RequestMapping(value="/save")
	public String saveCustomer(@ModelAttribute("cust") CustomerEntity cust)
	{
		System.out.println(cust);
		custserv.saveCustomer(cust);
		return "../../index";
	}

}
