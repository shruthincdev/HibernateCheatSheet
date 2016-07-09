package com.demo.hibernate.relationships.onetooneUniDirectional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

public class TestPerson {
	
	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();		
		cfg.addAnnotatedClass(Person.class);
		cfg.addAnnotatedClass(PersonDetails.class);
		cfg.configure("hibernate.cfg.xml");
		new SchemaExport(cfg).create(true, false);
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction t = session.beginTransaction();
		
		PersonDetails personDetails = new PersonDetails();
		personDetails.setJob("Analyst");
		personDetails.setZipcode("63099");
		personDetails.setIncome("2000");
		
		Person person = new Person();
		person.setPersonName("Varun");
		person.setPersonDetails(personDetails);
		
		session.save(person);
		t.commit();
		session.close();
		sf.close();
		
	}

}
