package com.cognizant.constructorPgm;
public class PojoClass {
	private int registerNo;
	private String name;
	private String Address;
	
	public PojoClass() {
	
	}
	
	public PojoClass(int registerNo, String name, String address) {
		
		this.registerNo = registerNo;
		this.name = name;
		Address = address;
	}



	public int getRegisterNo() {
		return registerNo;
	}
	public void setRegisterNo(int registerNo) {
		this.registerNo = registerNo;
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
		return "PojoClass [registerNo=" + registerNo + ", name=" + name + ", Address=" + Address + "]";
	}
	
	public void printData()
	
	{
		System.out.println("PojoClass [registerNo=" + registerNo + ", name=" + name + ", Address=" + Address + "]");
	}
	

}
