package com.sb.bank.rest.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sb.bank.rest.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, UUID> {

	public Optional<Customer> findByCustomerNumber(Long customerNumber);
	
}
