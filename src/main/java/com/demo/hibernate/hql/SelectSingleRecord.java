package com.demo.hibernate.hql;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.beans.CollegeBean;
import com.hibernate.beans.StudentBean;

public class SelectSingleRecord {

	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		String hql = "from CollegeBean where collegeId=150";
		Query q = session.createQuery(hql);
		Object o = q.uniqueResult();
		CollegeBean college = (CollegeBean)o;
		System.out.println("College details are :");
		System.out.println("College ID is " + college.getCollegeId());
		System.out.println("College Name is " + college.getCollegeName());
		System.out.println("College state is " + college.getCollegeState());
	}
	
}
