package com.st;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		System.out.println();
		System.out.println("\t ------------------ Hibernate Project Started");
		System.out.println();

		Studnet student1 = new Studnet();
		Address address1 = new Address();
		
		// Creating student object
		student1.setStudId(101);
		student1.setStudName("Sathish");
		student1.setEnrollCourse("B.Tech");
		student1.setStudEmail("sathish@gmail.com");
		student1.setStudContactNo("7709899882");
		
		// Creating Address Object
		address1.setAddressId(01);
		address1.setHouseNo("451/J");
		address1.setStreetNo("4th Cross, Lane 15");
		address1.setCityName("Chandigarh");
		address1.setStateName("Haryana");
		address1.setZipCode(100011);
		
		student1.setAddress(address1);
		
		// Creating Object of Configuration
		Configuration cfg = new Configuration();
		cfg.configure("hibernate-config.xml");

		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tran = session.beginTransaction();

		session.save(student1);
		session.save(address1);
		tran.commit();
		session.close();
		
		System.out.println("\t --------------- Student Records Inserterd");
	}
}