package com.demo.hibernate.hql;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class AggregateOperationAvg {

	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		String hql = "select avg(empSalary) from EmployeeBean";
		Query q = session.createQuery(hql);
		double avg = (Double)q.uniqueResult();
		System.out.println("The avg salary of all the employees is "+ avg);
		session.beginTransaction().commit();
		session.close();
		sf.close();
	}
	
}
