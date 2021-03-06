package com.cognizant.autowiringpgm;

public class StudentDetails {
	private int RegisterNo;
	private String name;
	private String address;
	private String zipcode;
	
	public StudentDetails()
	{
		
	}

	public StudentDetails(int registerNo, String name, String address, String zipcode) {
		
		RegisterNo = registerNo;
		this.name = name;
		this.address = address;
		this.zipcode = zipcode;
	}
	public int getRegisterNo() {
		return RegisterNo;
	}
	public void setRegisterNo(int registerNo) {
		RegisterNo = registerNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	@Override
	public String toString() {
		return "StudentDetails [RegisterNo=" + RegisterNo + ", name=" + name + ", address=" + address + ", zipcode="
				+ zipcode + "]";
	}
	
	

}
