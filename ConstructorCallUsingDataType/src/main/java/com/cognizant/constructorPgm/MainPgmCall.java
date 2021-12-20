package com.cognizant.constructorPgm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class MainPgmCall {

	public static void main(String args[])
	{	
	ApplicationContext context=new ClassPathXmlApplicationContext("consdatatype.xml");
	PojoClass fp=(PojoClass) context.getBean("fundatatype");
	fp.printData();
	}
}
