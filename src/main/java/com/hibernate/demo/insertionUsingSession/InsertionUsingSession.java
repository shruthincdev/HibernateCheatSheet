package com.hibernate.demo.insertionUsingSession;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.beans.StudentBean;

public class InsertionUsingSession {

	
	
	public static void main(String[] args) {
		StudentBean student = new StudentBean();
		student.setStudentId(10005);
		student.setStudentName("Sai");
		student.setStudentPhone("123456789");
		student.setStudentEmail("abc@gmail.com");
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		session.save(student);
		session.beginTransaction().commit();
		System.out.println("Data inserted sucessfully..!!");
		session.close();
	}
	
}
