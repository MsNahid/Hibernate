package org.nahidsohel;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.nahidsohel.entity.Song;

public class ReadApp {

    public static void main( String[] args ){

        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        configuration.addAnnotatedClass(Song.class);

//        Create SessionFactory
        SessionFactory sessionFactory = configuration.buildSessionFactory();

        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Song song = session.get(Song.class, 50);
        session.getTransaction().commit();

        System.out.println(song);

        session.close();

    }
}
