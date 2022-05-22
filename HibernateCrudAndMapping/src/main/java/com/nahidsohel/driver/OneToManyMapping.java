package com.nahidsohel.driver;

import com.nahidsohel.entities.Laptop;
import com.nahidsohel.entities.Ram;
import com.nahidsohel.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.rmi.server.ExportException;

public class OneToManyMapping {
	
	public static void main(String[] args) {
		
		SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
		
		if(sessionFactory != null){
			
			try{
				Session session = sessionFactory.openSession();
				
//				Laptop laptop1 = new Laptop();
//				Laptop laptop2 = new Laptop();
//
//
//				Ram ram1 = new Ram();
//				ram1.setSpace((short) 10);
//				ram1.setBrand("Samsung");
//
//				Ram ram2 = new Ram();
//				ram2.setSpace((short) 8);
//				ram2.setBrand("Transcend");
//
//				Ram ram3 = new Ram();
//				ram3.setSpace((short) 16);
//
//
//				Ram ram4 = new Ram();
//				ram4.setSpace((short) 2);
//				ram4.setBrand("Walton");
//
//				laptop1.addMappingProperty(ram1);
//				laptop1.addMappingProperty(ram4);
//				laptop2.addMappingProperty(ram3);
//				laptop2.addMappingProperty(ram2);
//
				session.getTransaction().begin();
//				session.persist(laptop1);
//				session.persist(laptop2);
				
				
				
				// read data
				Laptop laptop = session.get(Laptop.class, 11);
				System.out.println(laptop);
				System.out.println(laptop.getRamList());
				session.getTransaction().commit();
				
				session.close();
				
				
			}catch(Exception e){
				e.printStackTrace();
				System.out.println("Program failed");
				
			}
			
		}
	}
}
