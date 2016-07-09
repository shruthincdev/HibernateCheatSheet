package com.demo.hibernate.criteria;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import com.hibernate.beans.CollegeBean;
import com.hibernate.beans.EmployeeBean;

public class SingleRecordSelection {
	
	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session session2=sf.openSession();
		Criteria criteria = session2.createCriteria(EmployeeBean.class);
		Criterion criterion = Restrictions.eq("empid", 1002);
		criteria.add(criterion);
		Object o = criteria.uniqueResult();
		EmployeeBean employee = (EmployeeBean)o;
		System.out.println("Employee details are :");
		System.out.println("Employee ID is " + employee.getEmpid());
		System.out.println("Employee Name is " + employee.getEmpName());
		System.out.println("Employee Designation is " + employee.getEmpDesignation());
		System.out.println("Employee salary is " + employee.getEmpSalary());
		session2.close();
	}
}
