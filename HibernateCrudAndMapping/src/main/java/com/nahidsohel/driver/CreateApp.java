package com.nahidsohel.driver;

import com.nahidsohel.entities.Teacher;
import com.nahidsohel.utils.HibernateUtils;
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
				
				session.beginTransaction();
				session.save(teacher1);
				session.save(teacher2);
//				session.save(teacher3);
				session.getTransaction().commit();
				
			}finally {
				session.close();
			}
		}
	}
}
