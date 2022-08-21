package com.customer.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.customer.models.Customer;


@Repository
public interface CustomerRepository extends MongoRepository<Customer,String> {
	Customer findByUsername(String username);
}
