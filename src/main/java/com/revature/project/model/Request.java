package com.revature.project.model;

public class Request {
	private int id;
	private int amount;
	private String reason;
	private String status;
	
	
	public Request() {
		super();
	}


	public Request(int id, int amount, String reason, String status) {
		super();
		this.id = id;
		this.amount = amount;
		this.reason = reason;
		this.status = status;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getAmount() {
		return amount;
	}


	public void setAmount(int amount) {
		this.amount = amount;
	}


	public String getReason() {
		return reason;
	}


	public void setReason(String reason) {
		this.reason = reason;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	@Override
	public String toString() {
		return "Request [id=" + id + ", amount=" + amount + ", reason=" + reason + ", status=" + status
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
}
	