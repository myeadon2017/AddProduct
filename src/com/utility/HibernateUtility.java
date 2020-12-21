package com.utility;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.Session;

//This class is used as a Hibernate utility
public class HibernateUtility {

	
	private static SessionFactory sf;
	
	static{
		sf= new AnnotationConfiguration().configure().buildSessionFactory();
		
	}
	public static Session getSession(){
		
		Session session= sf.openSession();
		return session;
	}
}
