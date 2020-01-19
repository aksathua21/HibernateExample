package com.arun.test;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.query.Query;

import com.arun.entity.Employee;
import com.arun.entity.Task;
import com.boraji.tutorial.hibernate.HibernateUtil;

public class Test {

	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
	    session.beginTransaction();
	    Query<String> query=session.createQuery("select firstName from Employee");
	    //Criteria c = session.createCriteria(Employee.class);
	    List<String> list=query.list();
	    System.out.println(list.size());
	    System.out.println(list);
	    session.getTransaction().commit(); 
	    session.close();
	    HibernateUtil.shutdown();
	}

}
