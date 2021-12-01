package com.sb.bank.rest.service.helper;

import java.util.Date;

import org.springframework.stereotype.Component;

import com.sb.bank.rest.domain.AccountInformation;
import com.sb.bank.rest.domain.BankInformation;
import com.sb.bank.rest.domain.ContactDetails;
import com.sb.bank.rest.domain.CustomerDetails;
import com.sb.bank.rest.domain.TransactionDetails;
import com.sb.bank.rest.domain.TransferDetails;
import com.sb.bank.rest.entity.Account;
import com.sb.bank.rest.entity.Address;
import com.sb.bank.rest.entity.BankInfo;
import com.sb.bank.rest.entity.Contact;
import com.sb.bank.rest.entity.Customer;
import com.sb.bank.rest.entity.Transaction;

@Component
public class BankServiceHelper {

	public CustomerDetails convertToCustomerDomain(Customer customer) {
		return CustomerDetails.builder().firstName(customer.getFirstName()).middleName(customer.getMiddleName())
				.lastName(customer.getLastName()).customerNumber(customer.getCustomerNumber())
				.status(customer.getStatus()).contactDetails(convertToContactDomain(customer.getContact()))
				.customerAddress(convertToAddressDomain(customer.getAddress())).build();
	}

	private Address convertToAddressDomain(Address address) {
		return Address.builder().address1(address.getAddress1()).address2(address.getAddress2()).city(address.getCity()).state(address.getState()).zip(address.getZip()).country(address.getCountry()).build();
	}

	public Customer convertToCustomerEntity(CustomerDetails customerDetails) {
		return Customer.builder().firstName(customerDetails.getFirstName()).middleName(customerDetails.getMiddleName())
				.lastName(customerDetails.getLastName()).customerNumber(customerDetails.getCustomerNumber())
				.status(customerDetails.getStatus())
				.contact(convertToContactEntity(customerDetails.getContactDetails()))
				.address(convertToAddressDomain(customerDetails.getCustomerAddress())).build();
	}

	public AccountInformation convertToAccountDomain(Account account) {
		return AccountInformation.builder().accountType(account.getAccountType())
				.accountBalance(account.getAccountBalance()).accountNumber(account.getAccountNumber())
				.accountStatus(account.getAccountStatus())
				.bankInformation(convertToBankInfoEntity(account.getBankInformation())).build();
	}

	public Account convertToAccountEntity(AccountInformation accountInformation) {
		return Account.builder().accountType(accountInformation.getAccountType())
				.accountBalance(accountInformation.getAccountBalance())
				.accountNumber(accountInformation.getAccountNumber())
				.accountStatus(accountInformation.getAccountStatus())
				.bankInformation(convertToBankInfoEntity(accountInformation.getBankInformation())).build();
	}

	public Address convertToAddressEntity(Address address) {
		return Address.builder().address1(address.getAddress1()).address2(address.getAddress2()).city(address.getCity())
				.state(address.getState()).zip(address.getZip()).country(address.getCountry()).build();
	}

	private BankInfo convertToBankInfoEntity(BankInformation bankInformation) {
		return BankInfo.builder().branchCode(bankInformation.getBranchCode()).branchName(bankInformation.getBranchName()).routingNumber(bankInformation.getRoutingNumber()).branchAddress(bankInformation.getBranchAddress()).build();
	}

	private BankInformation convertToBankInfoEntity(BankInfo bankInformation) {
		return BankInformation.builder().branchCode(bankInformation.getBranchCode())
				.branchName(bankInformation.getBranchName()).routingNumber(bankInformation.getRoutingNumber())
				.branchAddress(convertToAddressEntity(bankInformation.getBranchAddress())).build();
	}

	private Contact convertToContactEntity(ContactDetails contactDetails) {
		return Contact.builder().emailId(contactDetails.getEmailId()).homePhone(contactDetails.getHomePhone())
				.workPhone(contactDetails.getWorkPhone()).build();
	}

	public ContactDetails convertToContactDomain(Contact contact) {
		return ContactDetails.builder().emailId(contact.getEmailId()).homePhone(contact.getHomePhone())
				.workPhone(contact.getWorkPhone()).build();
	}
	
	public TransactionDetails convertToTransactionDomain(Transaction transaction) {
		return TransactionDetails.builder().txAmount(transaction.getTxAmount()).txDateTime(transaction.getTxDateTime()).txType(transaction.getTxType()).accountNumber(transaction.getAccountNumber()).build();
	}
	
	public Transaction convertToTransactionEntity(TransactionDetails transactionDetails) {
		return Transaction.builder().txAmount(transactionDetails.getTxAmount()).txDateTime(transactionDetails.getTxDateTime()).txType(transactionDetails.getTxType()).accountNumber(transactionDetails.getAccountNumber()).build();
	}
	
	public Transaction createTransaction(TransferDetails transferDetails,Long accountNumber, String txType) {
		return Transaction.builder().accountNumber(accountNumber).txAmount(transferDetails.getTransferAmount()).txType(txType).txDateTime(new Date()).build();
	}
}
