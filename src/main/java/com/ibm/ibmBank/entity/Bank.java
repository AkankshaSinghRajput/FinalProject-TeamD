package com.ibm.ibmBank.entity;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class Bank {

	@NotNull
	private String ifscCode;
	@NotNull
	@NotBlank
	private String name;
	@NotNull
	@NotBlank
	private String branchName;
	
	private Address address;

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
}
