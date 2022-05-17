package org.nahidsohel.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.nahidsohel.entity.Song;

public class HibernateUtils {
	
	private static SessionFactory sessionFactory = null;
	
	public static SessionFactory getSessionFactory(){
		
		if(sessionFactory == null){
			// Create Configuration
			Configuration configuration = new Configuration();
			configuration.configure("hibernate.cfg.xml");
			configuration.addAnnotatedClass(Song.class);
			
			// Create SessionFactory
			sessionFactory = configuration.buildSessionFactory();
		}
		
		return sessionFactory;
	}
}
