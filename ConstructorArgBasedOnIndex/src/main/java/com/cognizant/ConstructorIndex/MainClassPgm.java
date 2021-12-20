package com.cognizant.ConstructorIndex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClassPgm {

	public static void main(String args[])
	{	
	ApplicationContext context=new ClassPathXmlApplicationContext("indexCall.xml");
	PojoClass fp=(PojoClass) context.getBean("indexcall");
	fp.printData();
	}
}
