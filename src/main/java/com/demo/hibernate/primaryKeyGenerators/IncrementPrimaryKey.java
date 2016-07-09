package com.demo.hibernate.primaryKeyGenerators;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.beans.CollegeBean;

public class IncrementPrimaryKey {

	public static void main(String[] args) {
			CollegeBean college1 = new CollegeBean();
			CollegeBean college2 = new CollegeBean();
			CollegeBean college3 = new CollegeBean();


			
			Configuration cfg=new Configuration();
			cfg.configure("hibernate.cfg.xml");
			SessionFactory sf=cfg.buildSessionFactory();
			Session session=sf.openSession();
			college1.setCollegeName("SNIST");
			college1.setCollegeState("Telangana");
			
			college2.setCollegeName("Wright");
			college2.setCollegeState("Ohio");
			
			college3.setCollegeName("Satyabhama");
			college3.setCollegeState("TamilNadu");
			session.save(college1);
			session.save(college2);
			session.save(college3);
			session.beginTransaction().commit();
			System.out.println("Data inserted sucessfully..!!");
			session.close();
	}
	
}
