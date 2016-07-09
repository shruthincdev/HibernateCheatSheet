package com.hibernate.demo.insertionUsingSession;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.beans.StudentBean;

public class SelectionUsingSession {

	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure("/hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Object o = session.get(StudentBean.class, 10001L);
		StudentBean student = (StudentBean)o;
		System.out.println("The value of 10003 record is ");
		System.out.println("Srudent ID :"+ student.getStudentId());
		System.out.println("Srudent Name :"+ student.getStudentName());
		System.out.println("Srudent Phone :"+ student.getStudentPhone());
		System.out.println("Srudent Email :"+ student.getStudentEmail());
		session.beginTransaction().commit();
		session.close();
	}
	
}
