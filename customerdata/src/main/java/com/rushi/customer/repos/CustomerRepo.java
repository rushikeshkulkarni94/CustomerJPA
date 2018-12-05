package com.rushi.customer.repos;

import org.springframework.data.repository.CrudRepository;

import com.rushi.customer.entity.Customer;

public interface CustomerRepo extends CrudRepository<Customer, Integer> {

}
