package com.nahidsohel.driver;

import com.nahidsohel.entities.Teacher;
import com.nahidsohel.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class UpdateApp {
	
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
		
		if(sessionFactory == null){
			System.out.println("Session factory null");
			return;
		}else{
			try{
				Session session = sessionFactory.openSession();
				
				session.beginTransaction();
				System.out.println("Update object using hql");
				session.createQuery("Update Teacher t set t.teacherName = 'Mun' where lower(t.teacherRank) like '%pro%'").executeUpdate();
				session.getTransaction().commit();
				
				session.close();
				
			}catch (Exception e){
				e.printStackTrace();
			}
		}
	}
}
