package com.poc.daoImpl;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.poc.dao.CustomerDao;
import com.poc.entity.CustomerEntity;

@Repository
public class CustomerDaoImpl implements CustomerDao {
	
	@Autowired
	SessionFactory sessionfactory;
	public void saveCustomer(CustomerEntity cust) {
		
		System.out.println("sessionFactory="+sessionfactory);
		System.out.println("Data Inserted");
		System.out.println("In daoImpl:"+cust);
		/*System.out.println("sf: "+sessionfactory.openSession());*/
		int a=(Integer)sessionfactory.getCurrentSession().save(cust);
		System.out.println("end a="+a);
	}

}
