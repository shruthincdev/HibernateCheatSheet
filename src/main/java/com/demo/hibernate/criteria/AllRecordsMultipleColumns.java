package com.demo.hibernate.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

import com.hibernate.beans.EmployeeBean;

public class AllRecordsMultipleColumns {
	
public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Criteria criteria = session.createCriteria(EmployeeBean.class);
		Projection projection1 = Projections.property("empName");
		Projection projection2 = Projections.property("empSalary");
		ProjectionList projectionList = Projections.projectionList();
		projectionList.add(projection1);
		projectionList.add(projection2);
		
		criteria.setProjection(projectionList);
		List<Object[]> list = criteria.list();
		System.out.println("List size is "+ list.size());
		int i=1;
		for(Object[] arr:list){
			System.out.println("Employee :" + i);
			System.out.println("Employee Name is " + arr[0]);
			System.out.println("Employee Salary is " + arr[1]);
			i++;
		}
		
		session.close();
		sf.close();
	
	}

}
