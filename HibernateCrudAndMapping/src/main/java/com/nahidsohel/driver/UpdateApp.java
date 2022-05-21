package com.nahidsohel.driver;

import com.nahidsohel.entities.Teacher;
import com.nahidsohel.utils.HibernateUtils;
import jakarta.persistence.EntityManager;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class UpdateApp {
	
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
		
		if(sessionFactory == null){
			System.out.println("Session factory null");
			return;
		}else{
			try{
				Session session = sessionFactory.openSession();
//				EntityManager entityManager = sessionFactory.createEntityManager();
				
				session.getTransaction().begin();
				System.out.println("Update object using hql");
				session.createQuery("Update Teacher t set t.teacherName = 'Mun' where lower(t.teacherRank) like '%pro%'", Teacher.class).executeUpdate();
				session.getTransaction().commit();
				
				session.close();
				
			}catch (Exception e){
				e.printStackTrace();
			}
		}
	}
}
