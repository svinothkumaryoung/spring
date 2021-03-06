package com.cognizant.studentPackage;

public class StudentNaming {

	private StudentDetails vinoth;
	private StudentDetails ashok;
	private StudentDetails roshan;
	private StudentDetails niranjan;
	
	public StudentNaming() {
		
	}
	public StudentDetails getVinoth() {
		return vinoth;
	}
	public void setVinoth(StudentDetails vinoth) {
		this.vinoth = vinoth;
	}
	public StudentDetails getAshok() {
		return ashok;
	}
	public void setAshok(StudentDetails ashok) {
		this.ashok = ashok;
	}
	public StudentDetails getRoshan() {
		return roshan;
	}
	public void setRoshan(StudentDetails roshan) {
		this.roshan = roshan;
	}
	public StudentDetails getNiranjan() {
		return niranjan;
	}
	public void setNiranjan(StudentDetails niranjan) {
		this.niranjan = niranjan;
	
	}
	void printStudentData()
	{
		System.out.println("*********   Vinoth Details   *************");
		System.out.println("Register No is "+getVinoth().getRegisterNo());
		System.out.println("Name is "+getVinoth().getName());
		System.out.println("Address is "+getVinoth().getAddress());
		System.out.println("Zip code is "+getVinoth().getZipcode());
		
		System.out.println("*********  Ashok Details   *************");
		System.out.println("Register No is "+getAshok().getRegisterNo());
		System.out.println("Name is "+getAshok().getName());
		System.out.println("Address is "+getAshok().getAddress());
		System.out.println("Zip code is "+getAshok().getZipcode());
		
		System.out.println("*********   Roshan Details   *************");
		System.out.println("Register No is "+getRoshan().getRegisterNo());
		System.out.println("Name is "+getRoshan().getName());
		System.out.println("Address is "+getRoshan().getAddress());
		System.out.println("Zip code is "+getRoshan().getZipcode());
		
		System.out.println("*********  Niranjan Details   *************");
		System.out.println("Register No is "+getNiranjan().getRegisterNo());
		System.out.println("Name is "+getNiranjan().getName());
		System.out.println("Address is "+getNiranjan().getAddress());
		System.out.println("Zip code is "+getNiranjan().getZipcode());
		
	}
	
	
}
