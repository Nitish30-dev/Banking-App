package com.sb.bank.rest.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TransferDetails {

	private Long fromAccountNumber;
	private Long toAccountNumber;
	private Double transferAmount;
}
