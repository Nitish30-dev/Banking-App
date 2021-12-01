package com.sb.bank.rest.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AddressDetails {

	private String address1;
	private String address2;
	private String city;
	private String state;
	private String zip;
	private String country;
}
