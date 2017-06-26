package model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.*;

public class MainDemo {
	public static void main(String args[])
	{
		Configuration cfg=new Configuration();
		cfg.configure("Hibernate.cfg.xml");
		SessionFactory sessionFactory=cfg.buildSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		Employee obj=new Employee();
		obj.setId(123);
		obj.setEmp_name("Vishal");
		obj.setEmp_addr("Thane");
		session.save(obj);
		tx.commit();
		session.close();
		System.out.println("Data base is updated");
		
	}

}
