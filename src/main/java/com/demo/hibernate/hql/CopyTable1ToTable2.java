package com.demo.hibernate.hql;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CopyTable1ToTable2 {

public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		String hql = "insert into CollegeBeanCopy(collegeId, collegeName, collegeState) select c.collegeId, c.collegeName, c.collegeState from CollegeBean c";
		Query q = session.createQuery(hql);
		int pkey = q.executeUpdate();
		session.beginTransaction().commit();
		session.close();
		sf.close();
		System.out.println("Table data copied");
	}
	
}
