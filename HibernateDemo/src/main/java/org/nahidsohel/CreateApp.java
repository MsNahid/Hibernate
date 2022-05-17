package org.nahidsohel;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.nahidsohel.entity.Song;

public class CreateApp
{
    public static void main( String[] args ){

        // Create Configuration
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        configuration.addAnnotatedClass(Song.class);

//        Create SessionFactory
        SessionFactory sessionFactory = configuration.buildSessionFactory();

//        Initialize Session Object
        Session session = sessionFactory.openSession();

        Song song1 = new Song();
        song1.setSongId(10);
        song1.setSongName("Fire aso na");
        song1.setSongArtist("Habib");

        session.beginTransaction();
        session.save(song1);
        session.getTransaction().commit();

        System.out.println("hello");

        session.close();
    }
}
