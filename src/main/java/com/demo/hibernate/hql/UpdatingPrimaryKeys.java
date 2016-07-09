package com.demo.hibernate.hql;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UpdatingPrimaryKeys {
	
public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		String hql = "update CollegeBean set collegeId=155, collegeName='Dummy college' where collegeId=152";
		Query q = session.createQuery(hql);
		int pkey = q.executeUpdate();
		session.beginTransaction().commit();
		session.close();
		sf.close();
		System.out.println("PK and single column updated");
	}

}
