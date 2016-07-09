package com.demo.hibernate.hql;


import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class DeleteRecord {

	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		String hql = "delete CollegeBean where collegeName='Wright'";
		Query q = session.createQuery(hql);
		int pkey = q.executeUpdate();
		System.out.println("Number of records deleted is " + pkey);
		session.beginTransaction().commit();
		session.close();
		sf.close();
	}
	
}
