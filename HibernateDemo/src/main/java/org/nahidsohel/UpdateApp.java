package org.nahidsohel;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.nahidsohel.entity.Song;

public class UpdateApp {

    public static void main( String[] args ){

        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        configuration.addAnnotatedClass(Song.class);

//        Create SessionFactory
        SessionFactory sessionFactory = configuration.buildSessionFactory();

        Session session = sessionFactory.openSession();

        Song song = session.get(Song.class, 5);
        song.setSongArtist("Dua Lipa");
        song.setSongName("Be the one");

        session.beginTransaction();
        session.update(song);
        session.getTransaction().commit();

        System.out.println(song);

        session.close();
    }
}
