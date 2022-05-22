package com.nahidsohel.driver;

import com.nahidsohel.entities.Laptop;
import com.nahidsohel.entities.Person;
import com.nahidsohel.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class OneToOneMapping {
	
	public static void main(String[] args) {
		
		System.out.println("OneToOne Mapping.");
		
		SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
		
		if(sessionFactory != null){
			
			try{
				Session session = sessionFactory.openSession();
				// create
				Person person1 = new Person(); // transient state
				Person person2 = new Person();
				Person person3 = new Person();

				Laptop laptop1 = new Laptop();
				Laptop laptop2 = new Laptop();
				Laptop laptop3 = new Laptop();

				laptop1.setBrand("Fujitsu");
				laptop1.setPerson(person1);
				laptop2.setBrand("Realme");
				laptop2.setPerson(person2);
				laptop3.setBrand("Walton");
//
				person1.setName("Moon");
				person1.setLaptop(laptop1);

				person2.setName("Sohel");
				person2.setLaptop(laptop2);

				person3.setName("Baki");
				person3.setLaptop(laptop3);
//
				session.beginTransaction();
				session.persist(person1);
				session.persist(person2);
				session.persist(person3);
				session.getTransaction().commit();
				
				
//
				
				int personPk = 11;
				Person person = session.get(Person.class, personPk);

				if(person != null){
					System.out.println(person);
					System.out.println(person.getLaptop());
				}
				
				
				
				session.beginTransaction();
//
				int laptopPk = 11;
				Laptop laptop = session.get(Laptop.class, laptopPk);

				if(laptop != null){
					System.out.println(laptop.getBrand());
					System.out.println(laptop.getPerson());

				}
//
				session.getTransaction().commit();
				
				session.close();
				
				
			}catch (Exception e){
				
				e.printStackTrace();
			}
		}
		
	}
}
