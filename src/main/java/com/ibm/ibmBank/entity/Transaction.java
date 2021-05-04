package com.ibm.ibmBank.entity;

import java.util.Date;

import com.ibm.ibmBank.T_TYPE;

public class Transaction {
	private String id;
	private Date transactionDate;
	private T_TYPE t_Type;
	private float amount;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Date getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}
	public T_TYPE getT_Type() {
		return t_Type;
	}
	public void setT_Type(T_TYPE t_Type) {
		this.t_Type = t_Type;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}

}
