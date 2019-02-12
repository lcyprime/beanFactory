package com.Ioc;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class test1 {

	private static String xml = "applicationContext.xml";
	
	public static void main(String[] args) {
		Resource rc = new ClassPathResource(xml);
		BeanFactory beanFactory = new XmlBeanFactory(rc);
		
		Stu s = (Stu)beanFactory.getBean("stu");
		Tea tea = (Tea)beanFactory.getBean("tea");
		
		System.out.println("StuName��" + s.getName());
		System.out.println("StuSchool��" + s.getSchool());
		System.out.println("TeaName��" + tea.getName());
		System.out.println("TeaS��" + tea.getS().getName() + " and " + tea.getS().getSchool());
		System.out.println("");
	}

}
