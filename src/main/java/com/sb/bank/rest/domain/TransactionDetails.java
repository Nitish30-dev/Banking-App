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
public class TransactionDetails {

	private Long accountNumber;
	private Date txDateTime;
	private String txType;
	private Double txAmount;
}
