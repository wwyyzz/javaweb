package com.wj.mvcapp.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.wj.mvcapp.dao.CustomerDAO;
import com.wj.mvcapp.domain.Customer;

public class CustomerDAOJdbcImplTest {
	
	private CustomerDAO customerDAO = (CustomerDAO) new CustomerDAOJdbcImplTest();
	

	@Test
	public void testGetAll() {
		fail("Not yet implemented");
	}

	@Test
	public void testSave() {
		Customer customer = new Customer();
		
		customer.setAddress("Beijing");
		customer.setName("abc");
		customer.setPhone("1371234567");
	}

	@Test
	public void testGetInteger() {
		Customer cust = customerDAO.get(1);
	}

	@Test
	public void testDelete() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetCountWithName() {
		fail("Not yet implemented");
	}

}
