package com.employee.Model;

public class FetchEmployeeModel {
	private int id;
	private String frist_name;
	private String last_name;
	private String email_address;
	
	public FetchEmployeeModel() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFrist_name() {
		return frist_name;
	}

	public void setFrist_name(String frist_name) {
		this.frist_name = frist_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getEmail_address() {
		return email_address;
	}

	public void setEmail_address(String email_address) {
		this.email_address = email_address;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", frist_name=" + frist_name + ", last_name=" + last_name + ", email_address="
				+ email_address + "]";
	}
	

}
