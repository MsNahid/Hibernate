package com.nahidsohel.utils;

import com.nahidsohel.entities.Student;
import com.nahidsohel.entities.Teacher;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
	
	private static SessionFactory sessionFactory = null;
	
	public static SessionFactory getSessionFactory(){
		if(sessionFactory == null){
			
			try{
				sessionFactory = new Configuration().configure()
						.addAnnotatedClass(Student.class)
						.addAnnotatedClass(Teacher.class)
						.buildSessionFactory();
				
			}catch (Exception e){
				e.printStackTrace();
				System.out.println("Session Factory not created succesfully!!");
				
			}
		}
		
		return sessionFactory;
	}
}
