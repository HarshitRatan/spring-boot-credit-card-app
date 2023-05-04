package com.ibm.bean;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "customer_tables")
public class Customer {

	@Id
	private int userId;

	@NotEmpty(message = "Name can not be Null or Empty")
	@Column(name = "name")
	private String name;

	@NotEmpty(message = "Email can not be Null or Empty")
	@Column(name = "email")
	private String email;

	@NotEmpty(message = "Contact Number can not be Null or Empty")
	@Column(name = "contactNumber")
	private String contactNo;

	@OneToOne(cascade = CascadeType.ALL)
	private Address address;

	@Override
	public String toString() {
		return "Customer [userId=" + userId + ", name=" + name + ", email=" + email + ", contactNo=" + contactNo
				+ ", address=" + address + "]";
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
}
