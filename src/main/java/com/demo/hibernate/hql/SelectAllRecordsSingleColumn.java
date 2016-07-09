package com.demo.hibernate.hql;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.beans.CollegeBean;

public class SelectAllRecordsSingleColumn {

	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		String hql = "select collegeName from CollegeBean";
		Query q = session.createQuery(hql);
		List<String> list = q.list();
		
		for(String name: list)
		{
			System.out.println(name);
		}
		
	}
	
}
