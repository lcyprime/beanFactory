package com;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.Ioc.Stu;
import com.Ioc.Tea;
import com.IocExercise.Student;

public class test {
	
	private static String xml = "applicationContext.xml";
	

	public static void Ioc(BeanFactory b){
		Stu s = (Stu)b.getBean("stu");
		Tea tea = (Tea)b.getBean("tea");
	
		System.out.println("StuName£º" + s.getName());
		System.out.println("StuSchool£º" + s.getSchool());
		System.out.println("TeaName£º" + tea.getName());
		System.out.println("TeaS£º" + tea.getS().getName() + " and " + tea.getS().getSchool());
	}
	
	public static void IocExercise(BeanFactory b){
		Student s = (Student)b.getBean("student");
		
		System.out.println("student.name = " + s.getName());
		System.out.println("student.number = " + s.getNumber());
		System.out.println("student.major = " + s.getMajor());
		System.out.println("student.school = " + s.getSchool());
	}
	public static void main(String[] args) {
		
		Resource rc = new ClassPathResource(xml);
		BeanFactory beanFactory = new XmlBeanFactory(rc);
		
		Ioc(beanFactory);
		
		System.out.println("----------/////////////////////----------");
		
		IocExercise(beanFactory);
	}

}
