package com.sb.bank.rest.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.sb.bank.rest.domain.AccountInformation;
import com.sb.bank.rest.domain.CustomerDetails;
import com.sb.bank.rest.domain.TransactionDetails;
import com.sb.bank.rest.domain.TransferDetails;

@Service
public interface BankService {
	
	public List<CustomerDetails> findAll();
	public ResponseEntity<Object> addCustomer(CustomerDetails customerDetails);
	public CustomerDetails findByCustomerNumber(Long customerNumber);
	public ResponseEntity<Object> updateCustomer(CustomerDetails customerDetails,Long customerNumber);
	public ResponseEntity<Object> deleteCustomer(Long customerNumber);
	public ResponseEntity<Object> findByAccountNumber(Long accountNumber);
	public ResponseEntity<Object> addNewAccount(AccountInformation accountInformation,Long customerNumber);
	public ResponseEntity<Object> transferDetails(TransferDetails transferDetails, Long customerNumber);
	public List<TransactionDetails> findTransactionsByAccountNumber(Long accountNumber);
}
