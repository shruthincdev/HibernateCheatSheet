package com.demo.hibernate.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.hibernate.beans.EmployeeBean;

public class AllRecordsSingleColumnSelection {

	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Criteria criteria = session.createCriteria(EmployeeBean.class);
		Projection projection = Projections.property("empName");
		criteria.setProjection(projection);
		List<String> list = criteria.list();
		System.out.println("List size is "+ list.size());
		int i=1;
		for(String name:list){
			System.out.println("Employee :" + i);
			System.out.println("Employee Name is " + name);
			i++;
		}
	
	}
}
