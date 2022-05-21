package org.nahidsohel;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.nahidsohel.entity.Song;
import org.nahidsohel.utils.HibernateUtils;

public class CreateApp {
	public static void main(String[] args) {

//        // Create Configuration
//        Configuration configuration = new Configuration();
//        configuration.configure("hibernate.cfg.xml");
//        configuration.addAnnotatedClass(Song.class);
//
//        Create SessionFactory
		SessionFactory sessionFactory = HibernateUtils.getSessionFactory();

//        Initialize Session Object
		if (sessionFactory != null) {
			Session session = sessionFactory.openSession();
			
			Song song1 = new Song();
//			song1.setSongId(2);
			song1.setSongName("abc");
			song1.setSongArtist("akbor");
			
			session.beginTransaction();
			session.persist(song1);
			session.getTransaction().commit();
			
			System.out.println("hello");
			
			session.close();
			
		}
		
	}
}
