package com.poc.serviceImpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.poc.dao.CustomerDao;
import com.poc.entity.CustomerEntity;
import com.poc.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	CustomerDao custdao;
	@Transactional
	public void saveCustomer(CustomerEntity cust) {
		
		custdao.saveCustomer(cust);
		
	}

}
