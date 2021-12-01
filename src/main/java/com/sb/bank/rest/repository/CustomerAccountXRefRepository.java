package com.sb.bank.rest.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sb.bank.rest.entity.CustomerAccountXRef;

public interface CustomerAccountXRefRepository extends JpaRepository<CustomerAccountXRef, UUID> {
	
}
