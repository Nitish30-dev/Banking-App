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
public class CustomerDetails {

	private String firstName;
	private String lastName;
	private String middleName;
	private Long customerNumber;
	private String status;
	private Address customerAddress;
	private ContactDetails contactDetails;
}
