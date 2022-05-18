package org.nahidsohel;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.nahidsohel.entity.Song;
import org.nahidsohel.utils.HibernateUtils;

public class ReadApp {
	
	public static void main(String[] args) {

//        Configuration configuration = new Configuration();
//        configuration.configure("hibernate.cfg.xml");
//        configuration.addAnnotatedClass(Song.class);

//        Create SessionFactory
		SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
		
		if (sessionFactory != null) {
			Session session = sessionFactory.openSession();
			
			session.beginTransaction();
			Song song = session.get(Song.class, 50);
			session.getTransaction().commit();
			
			System.out.println(song);
			
			session.close();
		}
	}
}
