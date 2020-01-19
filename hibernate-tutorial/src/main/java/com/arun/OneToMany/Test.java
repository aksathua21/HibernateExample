package com.arun.OneToMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import com.boraji.tutorial.hibernate.HibernateUtil;

public class Test {

	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
	    session.beginTransaction();
	    
	    BankCards c = new BankCards();
	    c.setNumber("1234 5678 1234 5678");
	    c.setCardType(CardType.CREADIT);
	    c.setBalance(20000);
	    BankCards c1 = new BankCards();
	    c1.setNumber("1234 5678 1234 1234");
	    c1.setCardType(CardType.CREADIT);
	    c1.setBalance(20000);
	    List<BankCards> cards = new ArrayList<>();
	    cards.add(c);
	    cards.add(c1);
	    Person p = new Person(); 
	    p.setId(1001);
	    p.setName("Arun Sathua");
	    p.setAddress("43,Pradhan Sahi,Itamati,Nayaharh,Odisa-752068");
	    p.setCardType(cards);
	    session.save(p);
	    session.getTransaction().commit(); 
	    session.close();
	    HibernateUtil.shutdown();
	}

}
