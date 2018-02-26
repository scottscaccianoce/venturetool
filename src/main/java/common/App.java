package common;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import venturetool.models.Worker;
import venturetool.persistance.HibernateUtil;

public class App {

	private static SessionFactory sessionFactory = null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Testing");
		sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		/*
		Worker worker = new Worker();
		worker.setName("Scott Scaccianoce");
		worker.setUsername("ss");
		worker.setPassword("pass");
		session.save(worker);
		session.getTransaction().commit();
		session.close();
		*/
		
		sessionFactory.close();
	}

}
