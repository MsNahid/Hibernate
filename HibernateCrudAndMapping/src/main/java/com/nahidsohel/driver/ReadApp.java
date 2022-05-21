package com.nahidsohel.driver;

import com.nahidsohel.entities.Teacher;
import com.nahidsohel.utils.HibernateUtils;
import jakarta.persistence.EntityManager;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class ReadApp {
	
	public static void main(String[] args) {
		
		SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
		
		if(sessionFactory == null){
			System.out.println("Session factory null");
			return;
		}else{
			try{
				
				
				Session session = sessionFactory.openSession();
				
				System.out.println("Retrieve Teacher Objects");
				session.beginTransaction();
				
				List teacherList = session.createQuery("From Teacher t where lower(t.teacherRank) like '%pro%' ", Teacher.class).list();
				
				System.out.println(teacherList.size());
				
				for(Object teacher : teacherList){
					System.out.println(teacher);
				}
				session.getTransaction().commit();
				
				session.close();
				
			}catch (Exception e){
				e.printStackTrace();
			}
		}
	}
}
