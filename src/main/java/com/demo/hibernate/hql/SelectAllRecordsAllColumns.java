package com.demo.hibernate.hql;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.beans.CollegeBean;

public class SelectAllRecordsAllColumns {
	
public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		String hql = "from CollegeBean";
		Query q = session.createQuery(hql);
		List<CollegeBean> list = q.list();
		
		for(CollegeBean college: list)
		{
			System.out.println("College Id " + college.getCollegeId()  +" Name :" + college.getCollegeName() + " State :" + college.getCollegeState());
		}
		
	}

}
