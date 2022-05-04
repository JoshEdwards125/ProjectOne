package com.revature.project.model;

public class Employee {
	private int id;
	private String f_name;
	private String email;
	private String amount;
	private String reason;
	private String status;
	


	public Employee() {
		super();
	}


	public Employee(int id, String f_name, String email, String amount, String reason, String status) {
		super();
		this.id = id;
		this.f_name = f_name;
		this.email = email;
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


	public String getF_name() {
		return f_name;
	}


	public void setF_name(String f_name) {
		this.f_name = f_name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getAmount() {
		return amount;
	}


	public void setAmount(String amount) {
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
		return "Employee [id=" + id + ", f_name=" + f_name + ", email=" + email + ", amount=" + amount + ", reason="
				+ reason + ", status=" + status + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
	
	
}	