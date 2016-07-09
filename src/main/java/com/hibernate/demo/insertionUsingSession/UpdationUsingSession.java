package com.hibernate.demo.insertionUsingSession;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.beans.StudentBean;

public class UpdationUsingSession {
	
	
	public static void main(String[] args) {
		StudentBean student = new StudentBean();
		student.setStudentId(10002);
		student.setStudentName("Hari");
		student.setStudentPhone("123456789");
		student.setStudentEmail("xyz@gmail.com");
		
		Configuration cfg=new Configuration();
		cfg.configure("/hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		session.update(student);;
		session.beginTransaction().commit();
		System.out.println("Data updated sucessfully..!!");
		session.close();
	}

}
