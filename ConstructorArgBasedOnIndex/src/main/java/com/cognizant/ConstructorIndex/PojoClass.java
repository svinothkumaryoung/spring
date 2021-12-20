package com.cognizant.ConstructorIndex;

public class PojoClass {
	private int RegisterNo;
	private String name;
	private String Address;
	public PojoClass() {
	
	}
	public PojoClass(int registerNo, String name, String address) {
		
		RegisterNo = registerNo;
		this.name = name;
		Address = address;
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
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	@Override
	public String toString() {
		return "PojoClass [RegisterNo=" + RegisterNo + ", name=" + name + ", Address=" + Address + "]";
	}
	
	
	public void printData()
	{
		System.out.println("PojoClass [RegisterNo=" + RegisterNo + ", name=" + name + ", Address=" + Address + "]");
	}
	
	

}
