package com.sb.bank.rest.entity;

import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class BankInfo {

	private UUID id;
	private String branchCode;
	private String branchName;
	@OneToOne(cascade = CascadeType.ALL)
	private Address branchAddress;
	private Integer routingNumber;
}
