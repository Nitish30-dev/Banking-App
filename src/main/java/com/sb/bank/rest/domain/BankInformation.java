package com.sb.bank.rest.domain;

import com.sb.bank.rest.entity.Address;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BankInformation {

	private String branchName;
	private String branchCode;
	private Address branchAddress;
	private Integer routingNumber;
	
}
