package com.sb.bank.rest.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.sb.bank.rest.domain.AccountInformation;
import com.sb.bank.rest.domain.CustomerDetails;
import com.sb.bank.rest.domain.TransactionDetails;
import com.sb.bank.rest.domain.TransferDetails;
import com.sb.bank.rest.entity.Customer;
import com.sb.bank.rest.repository.AccountRepository;
import com.sb.bank.rest.repository.CustomerAccountXRefRepository;
import com.sb.bank.rest.repository.CustomerRepository;
import com.sb.bank.rest.repository.TransactionRepository;
import com.sb.bank.rest.service.helper.BankServiceHelper;

public class BankServiceImpl implements BankService {

	@Autowired private CustomerRepository customerRepo;
	@Autowired private AccountRepository accountRepo;
	@Autowired private CustomerAccountXRefRepository customerAccXRefRepo;
	@Autowired private TransactionRepository transactionRepo;
	@Autowired private BankServiceHelper bankServiceHelper;
	
	@Override
	public List<CustomerDetails> findAll() {
		List<CustomerDetails> allCustomerDetails= new ArrayList<>();
		Iterable<Customer> customerList= customerRepo.findAll();
		customerList.forEach(customer->allCustomerDetails.add(bankServiceHelper.convertToCustomerDomain(customer)));
		return allCustomerDetails;
	}

	@Override
	public ResponseEntity<Object> addCustomer(CustomerDetails customerDetails) {
		Customer customer=bankServiceHelper.convertToCustomerEntity(customerDetails);
		customer.setCreatedDateTime(new Date());
		customerRepo.save(customer);
		return new ResponseEntity<Object>(customer, HttpStatus.OK);
	}

	@Override
	public CustomerDetails findByCustomerNumber(Long customerNumber) {
		Optional<Customer> customerOptional=customerRepo.findByCustomerNumber(customerNumber);
		if(customerOptional.isPresent())
			return bankServiceHelper.convertToCustomerDomain(customerOptional.get());
		return null;
	}

	@Override
	public ResponseEntity<Object> updateCustomer(CustomerDetails customerDetails, Long customerNumber) {
		// TODO Auto-generated method stub
		//updating the customer
		return null;
	}

	@Override
	public ResponseEntity<Object> deleteCustomer(Long customerNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<Object> findByAccountNumber(Long accountNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<Object> addNewAccount(AccountInformation accountInformation, Long customerNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<Object> transferDetails(TransferDetails transferDetails, Long customerNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TransactionDetails> findTransactionsByAccountNumber(Long accountNumber) {
		// TODO Auto-generated method stub
		return null;
	}

}
