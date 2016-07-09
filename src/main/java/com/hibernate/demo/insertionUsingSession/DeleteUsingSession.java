package com.hibernate.demo.insertionUsingSession;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.beans.StudentBean;

public class DeleteUsingSession {
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("/hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		StudentBean student = new StudentBean();
		student.setStudentId(10004);
		session.delete(student);
		session.beginTransaction().commit();
		System.out.println("Data deleted sucessfully..!!");
		session.close();
	}

}
