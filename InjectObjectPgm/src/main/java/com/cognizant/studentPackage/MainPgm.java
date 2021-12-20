package com.cognizant.studentPackage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//Program :Inject Object :Dependency Injection
public class MainPgm {

	
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("studentinfo.xml");
		StudentNaming sn=(StudentNaming) context.getBean("studentdetails1");
		sn.printStudentData();
	}
}

