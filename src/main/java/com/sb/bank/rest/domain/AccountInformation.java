package com.sb.bank.rest.domain;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AccountInformation {

	private Long accountNumber;
	private BankInformation bankInformation;
	private String accountStatus;
	private String accountType;
	private Double accountBalance;
	private Date accountCreated;
	
}
