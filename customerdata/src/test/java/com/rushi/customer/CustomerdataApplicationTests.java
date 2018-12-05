package com.rushi.customer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.rushi.customer.entity.Customer;
import com.rushi.customer.repos.CustomerRepo;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomerdataApplicationTests {
	@Autowired
	CustomerRepo repo;
	@Test
	public void createCustomer() {
		
		Customer cust=new Customer();
		cust.setEmail("abc@gmail.com");
		cust.setName("Pramesh");
		repo.save(cust);
		
	}
	
	@Test
	public void findCustomerbyid() {
		
	Customer cust=repo.findById(3).get();
	System.out.println(cust);
	
		
	}
	
	@Test
	public void updateCustomerbyid() {
		
	Customer cust=repo.findById(3).get();
	cust.setEmail("changed@gmail.com");
	repo.save(cust);
	System.out.println(cust);
	
		
	}
	@Test
	public void deleteCustomerbyid() {
		
	repo.deleteById(3);
	
		
	}



}
