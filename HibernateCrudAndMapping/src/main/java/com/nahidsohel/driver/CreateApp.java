package com.nahidsohel.driver;

import com.nahidsohel.entities.Teacher;
import com.nahidsohel.utils.HibernateUtils;
import jakarta.persistence.EntityManager;
import org.hibernate.SessionFactory;

public class CreateApp {
	
	public static void main(String[] args) {
		
		System.out.println("Hello Create App");
		
		SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
		
		if(sessionFactory == null){
			System.out.println("Session factory null");
		}
		
		if(sessionFactory != null){
			
//			Session session = sessionFactory.openSession();
			EntityManager entityManager = sessionFactory.createEntityManager();
			
			try{
				System.out.println("Created New Object.");
//				Student student = new Student();
//				student.setStuName("Moon");
//				student.setStuDept("B.TECH");
				
				Teacher teacher1 = new Teacher();
				Teacher teacher2 = new Teacher();
//				Teacher teacher3 = new Teacher();
				
				teacher1.setTeacherName("Bolt");
				teacher1.setTeacherRank("Professor");

				teacher2.setTeacherName("Altab");
				teacher2.setTeacherRank("Professor");
				
//				teacher3.setTeacherName("Alim");
//				teacher3.setTeacherRank("Professor");
				
				entityManager.getTransaction().begin();
				entityManager.persist(teacher1);
				entityManager.persist(teacher2);
//				entityManager.save(teacher3);
				entityManager.getTransaction().commit();
				
			}finally {
				entityManager.close();
			}
		}
	}
}
