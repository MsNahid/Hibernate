package org.nahidsohel.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.nahidsohel.entity.Song;

public class HibernateUtils {
	
	private static SessionFactory sessionFactory = null;
	
	public static SessionFactory getSessionFactory(){
		
		if(sessionFactory == null){
			// Create Configuration
//			Configuration configuration = new Configuration();
//			configuration.configure("hibernate.cfg.xml");
//			configuration.addAnnotatedClass(Song.class);
//
//			// Create SessionFactory
//			sessionFactory = configuration.buildSessionFactory();
			
			try{
				sessionFactory = new Configuration()
						.configure()
						.addAnnotatedClass(Song.class)
						.buildSessionFactory();
			
			}catch (Exception e){
				e.printStackTrace();
				System.out.println("Session Factory Object is not created.");
				
			}
			
		}
		
		return sessionFactory;
	}
}
