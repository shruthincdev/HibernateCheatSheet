package com.demo.hibernate.relationships.ManytoMany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

import com.demo.hibernate.relationships.onetoMany.Department;
import com.demo.hibernate.relationships.onetoMany.Faculty;

public class TestEvent {

public static void main(String[] args) {
		
		Configuration cfg=new Configuration();		
		cfg.addAnnotatedClass(Event.class);
		cfg.addAnnotatedClass(Delegate.class);
		cfg.configure("hibernate.cfg.xml");
		new SchemaExport(cfg).create(true, true);;
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction t = session.beginTransaction();
		
		Delegate delegate1 = new Delegate();
		Delegate delegate2 = new Delegate();
		Delegate delegate3 = new Delegate();
		delegate1.setDelegateName("Shruthin");
		delegate2.setDelegateName("Goutham");
		delegate3.setDelegateName("Sai");
		
		Event event1 = new Event();
		Event event2 = new Event();
		Event event3 = new Event();
		Event event4 = new Event();
		event1.setEventName("Placement Drive");
		event2.setEventName("Smokey Mountain");
		event3.setEventName("NYC tour");
		event4.setEventName("Study");
		
		event1.getDelegates().add(delegate1);
		event1.getDelegates().add(delegate2);
		event2.getDelegates().add(delegate2);
		event2.getDelegates().add(delegate3);
		event3.getDelegates().add(delegate1);
		event4.getDelegates().add(delegate1);
		event4.getDelegates().add(delegate2);
		event4.getDelegates().add(delegate3);
		
		
		session.save(delegate1);
		session.save(delegate2);
		session.save(delegate3);
		session.save(event1);
		session.save(event2);
		session.save(event3);
		session.save(event4);

		t.commit();
		session.close();
		sf.close();
		
		System.out.println("Data inserted Successfully");
		
	}


	
}
