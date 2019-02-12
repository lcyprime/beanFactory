package com.IocExercise;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class test2 {

	private static String xml = "applicationContext.xml";
	
	public static void main(String[] args) {		
		Resource rc = new ClassPathResource(xml);
		BeanFactory beanFactory = new XmlBeanFactory(rc);
		
		Student s = (Student)beanFactory.getBean("student");
		System.out.println("student.name = " + s.getName());
		System.out.println("student.number = " + s.getNumber());
		System.out.println("student.major = " + s.getMajor());
		System.out.println("student.school = " + s.getSchool());


	}

}
