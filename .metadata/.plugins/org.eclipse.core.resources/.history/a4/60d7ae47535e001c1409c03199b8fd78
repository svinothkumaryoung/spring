package com.cognizantBasicsPgm;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class MainPgm {

	
	public static void main(String[] args) {
		BeanFactory factory=new XmlBeanFactory(new FileSystemResource("spring.xml"));
		FunctionPgm fp=(FunctionPgm) factory.getBean("functionPgm1");
		fp.printDetails();
	}
}
//BeanFactory>> Instantiate bean when you call getBean() method
//One of the Popular implementation of BeanFactory interface is XmlBeanFactory
//BeanFactory doesn't provide support for internationalization
