package com.demo.hibernate.relationships.onetoMany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

import com.demo.hibernate.relationships.onetooneUniDirectional.Person;
import com.demo.hibernate.relationships.onetooneUniDirectional.PersonDetails;

public class Test {
	
public static void main(String[] args) {
		
		Configuration cfg=new Configuration();		
		cfg.addAnnotatedClass(Department.class);
		cfg.addAnnotatedClass(Faculty.class);
		cfg.configure("hibernate.cfg.xml");
		new SchemaExport(cfg).create(true, false);;
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction t = session.beginTransaction();
		
		Department d = new Department();
		d.setDepName("Industrial Engineering");
		
		Faculty f1 = new Faculty();
		f1.setFacultyName("charan");
		
		Faculty f2 = new Faculty();
		f2.setFacultyName("Nayak");
		
		f1.setFacultyDepartment(d);
		f2.setFacultyDepartment(d);
		
		session.save(d);
		session.save(f1);
		session.save(f2);
		t.commit();
		session.close();
		sf.close();
		
		System.out.println("Data inserted Successfully");
		
	}


}
