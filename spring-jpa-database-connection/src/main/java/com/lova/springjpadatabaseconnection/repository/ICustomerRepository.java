package com.lova.springjpadatabaseconnection.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lova.springjpadatabaseconnection.model.Customer;

@Repository
public interface ICustomerRepository extends JpaRepository<Customer, Long> {

	
}
