package com.demo.hibernate.hql;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SelectAllRecordsMultipleColumns {
	
public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		String hql = "select collegeName, collegeState from CollegeBean";
		Query q = session.createQuery(hql);
		List<String> list = q.list();
		
		for(Object o: list)
		{
			Object ar[] = (Object[])o;
			System.out.println("Name :" + ar[0] + " State :" + ar[1]);
		}
	}

}
