package com.cognizantBasicsPgm;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class MainPgm {

	
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		FunctionPgm fp=(FunctionPgm) context.getBean("functionPgm1");
		fp.printData();
	}
}
//1.Application Context=>Application Context Initiated Singleton bean when container 
//is started.It doesnt wait for getBeans to be called.


//2.Application Context will provide support for Internationalization

//3.ApplicationContext spring.xml file is in Resource Directory
