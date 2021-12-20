
package com.cognizant.autowiringpgm;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//Program :Autowiring 
public class MainPgm {

	
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("autowirepgm.xml");
		StudentNaming sn=(StudentNaming) context.getBean("studentdetails1");
		sn.printStudentData();
	}
}

