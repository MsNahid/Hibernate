package com.nahidsohel.driver;

import com.nahidsohel.entities.Teacher;
import com.nahidsohel.utils.HibernateUtils;
import jakarta.persistence.EntityManager;
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
				
				EntityManager entityManager = sessionFactory.createEntityManager();
				
				System.out.println("Retrieve Teacher Objects");
				entityManager.getTransaction().begin();
				
				List<Teacher> teacherList = entityManager.createQuery("From Teacher t where lower(t.teacherRank) like '%pro%' ").getResultList();
				
				System.out.println(teacherList.size());
				
				for(Object teacher : teacherList){
					System.out.println(teacher);
				}
				entityManager.getTransaction().commit();
				
				entityManager.close();
				
			}catch (Exception e){
				e.printStackTrace();
			}
		}
	}
}
