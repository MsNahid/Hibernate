package org.nahidsohel;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.nahidsohel.entity.Song;
import org.nahidsohel.utils.HibernateUtils;

public class DeleteApp {
	
	public static void main(String[] args) {

//        Configuration configuration = new Configuration();
//        configuration.configure("hibernate.cfg.xml");
//        configuration.addAnnotatedClass(Song.class);

//        Create SessionFactory
		SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
		if (sessionFactory != null) {
			Session session = sessionFactory.openSession();
			
			Song song = session.get(Song.class, 13);
			System.out.println(song);
			
			session.beginTransaction();
			session.remove(song);
			session.getTransaction().commit();
			
			session.close();
		}
	}
}
