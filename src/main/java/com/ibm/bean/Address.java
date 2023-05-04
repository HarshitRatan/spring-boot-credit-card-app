package com.ibm.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="address_tables")
public class Address {

	@Id
	@Column(name="aid")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int addId;
	@NotEmpty(message = "Door number can not be null")
	private String doorNo;
	@NotEmpty(message = "Street can not be null")
	private String street;
	@NotEmpty(message = "Area can not be null")
	private String area;
	@NotEmpty(message = "City can not be null")
	private String city;
	@NotEmpty(message = "State can not be null")
	private String state;
	
	@NotNull(message = "Pincode can not be null")
	private int pincode;
	
	@Override
	public String toString() {
		return "Address [doorNo=" + doorNo + ", street=" + street + ", area=" + area + ", city=" + city + ", state="
				+ state + ", pincode=" + pincode + "]";
	}
	public String getDoorNo() {
		return doorNo;
	}
	public void setDoorNo(String doorNo) {
		this.doorNo = doorNo;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
}
