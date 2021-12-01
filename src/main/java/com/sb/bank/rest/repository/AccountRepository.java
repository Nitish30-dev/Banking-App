package com.sb.bank.rest.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sb.bank.rest.entity.Account;

public interface AccountRepository extends JpaRepository<Account, UUID> {

	public Optional<Account> findByAccountNumber(Long accountNumber);
}
