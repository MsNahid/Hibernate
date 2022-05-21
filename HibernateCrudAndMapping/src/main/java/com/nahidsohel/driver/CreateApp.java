package com.nahidsohel.driver;

import com.nahidsohel.entities.Laptop;
import com.nahidsohel.entities.Teacher;
import com.nahidsohel.utils.HibernateUtils;
import jakarta.persistence.EntityManager;
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
			
//			EntityManager entityManager = sessionFactory.createEntityManager();
			Session session = sessionFactory.openSession();
			
			try{
				System.out.println("Created New Object.");
//				Student student = new Student();
//				student.setStuName("Moon");
//				student.setStuDept("B.TECH");
				
//				Teacher teacher1 = new Teacher();
//				Teacher teacher2 = new Teacher();
//				Teacher teacher3 = new Teacher();
				
//				teacher1.setTeacherName("Bolt");
//				teacher1.setTeacherRank("Professor");
//
//				teacher2.setTeacherName("Altab");
//				teacher2.setTeacherRank("Professor");
				
//				teacher3.setTeacherName("Alim");
//				teacher3.setTeacherRank("Professor");
				
				Laptop laptop1 = new Laptop();
				Laptop laptop2 = new Laptop();
				Laptop laptop3 = new Laptop();
				Laptop laptop4 = new Laptop();
				Laptop laptop5 = new Laptop();
				laptop1.setBrand("Dell");
				laptop2.setBrand("Hp");
				laptop3.setBrand("Lenovo");
				laptop4.setBrand("Mac");
				laptop5.setBrand("Mi");
				
				
				session.getTransaction().begin();
				session.persist(laptop1);
				session.persist(laptop2);
				session.persist(laptop3);
				session.persist(laptop4);
				session.persist(laptop5);
				session.getTransaction().commit();
				
			}finally {
				session.close();
			}
		}
	}
}
