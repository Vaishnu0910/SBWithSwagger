package com.csi.jpa;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class Service {
	private static SessionFactory factory = new AnnotationConfiguration().configure().buildSessionFactory();

	public static void main(String[] args) {
		saveproductdata();

		getproductdata();
	}

	static void saveproductdata() {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

		Product product = new Product();

		product.setProductName("abhi");
		product.setProductprice(76666.66);

		session.save(product);
		transaction.commit();

	}

	static void getproductdata() {
		Session session = factory.openSession();
		
		List<Product> prolist = session.createQuery("select Product").list();
		
		prolist.forEach(p->System.out.println(p));
		
		
	}
}
