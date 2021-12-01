package com.sb.bank.rest.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sb.bank.rest.entity.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, UUID> {

	public Optional<Transaction> findByAccountNumber(Long accountNumber);
	
}
