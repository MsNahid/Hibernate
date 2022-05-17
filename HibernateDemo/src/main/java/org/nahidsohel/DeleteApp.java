package org.nahidsohel;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.nahidsohel.entity.Song;

public class DeleteApp {

    public static void main( String[] args ){

        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        configuration.addAnnotatedClass(Song.class);

//        Create SessionFactory
        SessionFactory sessionFactory = configuration.buildSessionFactory();

        Session session = sessionFactory.openSession();

        Song song = session.get(Song.class,13);
        System.out.println(song);

        session.beginTransaction();
        session.delete(song);
        session.getTransaction().commit();

        session.close();
    }
}
