package org.example.driver;

import org.example.entities.Student;
import org.example.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class CreateApp {
	
	public static void main(String[] args) {
		
		System.out.println("Hello Create App");
		
		SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
		
		if(sessionFactory == null){
			System.out.println("Session factory null");
		}
		
		if(sessionFactory != null){
			
			Session session = sessionFactory.openSession();
			
			try{
				System.out.println("Created New Student Object.");
				Student student = new Student();
				student.setStuName("Moon");
				student.setStuDept("B.TECH");
				
				session.beginTransaction();
				session.save(student);
				session.getTransaction().commit();
				
			}finally {
				
				session.close();
			}
		}
	}
}
