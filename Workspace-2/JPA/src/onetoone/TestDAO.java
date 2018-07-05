package onetoone;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestDAO {
	
	private void addVisitor_PassportRecord() 
	{
		
		EntityManagerFactory emf=null;
		EntityManager em=null;
		
		emf=Persistence.createEntityManagerFactory("JPA");
		em=emf.createEntityManager();
		
		Passport passport=new Passport();
		passport.setPassportNo("P3");
		passport.setDateOfExpiry(new Date());
		
		Visitor visitor=new Visitor();
		visitor.setVisitorId(102);
		visitor.setVisitorName("KITE");
		visitor.setPassport(passport);
		
		EntityTransaction et=em.getTransaction();
		et.begin();
		em.persist(visitor);
		et.commit();
		
	}
	
	private void addPassportRecord() 
	{
		
		EntityManagerFactory emf=null;
		EntityManager em=null;
		
		emf=Persistence.createEntityManagerFactory("JPA");
		em=emf.createEntityManager();
		
		Passport passport=new Passport();
		passport.setPassportNo("P3");
		passport.setDateOfExpiry(new Date());
	
		
		EntityTransaction et=em.getTransaction();
		et.begin();
		em.persist(passport);
		et.commit();
		
	}
	
	private void addVisitorRecord() 
	{
		
		EntityManagerFactory emf=null;
		EntityManager em=null;
		
		emf=Persistence.createEntityManagerFactory("JPA");
		em=emf.createEntityManager();
		
		Visitor visitor=new Visitor();
		visitor.setVisitorId(103);
		visitor.setVisitorName("KITE");
		//visitor.setPassport(null);
		
		EntityTransaction et=em.getTransaction();
		et.begin();
		em.persist(visitor);
		et.commit();
		
	}
	
	private void addVisitorWithoutPassportRecord() 
	{
		
		EntityManagerFactory emf=null;
		EntityManager em=null;
		
		emf=Persistence.createEntityManagerFactory("JPA");
		em=emf.createEntityManager();
		
		
		Passport p=em.find(Passport.class,"P1");
		
		Visitor visitor=new Visitor();
		visitor.setVisitorId(103);
		visitor.setVisitorName("KITE");
		visitor.setPassport(p);
		
		EntityTransaction et=em.getTransaction();
		
		et.begin();
		em.persist(visitor);
		et.commit();
		
	}
	
	private void removeVisitor_PassportRecord() 
	{
		
		EntityManagerFactory emf=null;
		EntityManager em=null;
		
		emf=Persistence.createEntityManagerFactory("JPA");
		em=emf.createEntityManager();
		
		
		Visitor v=em.find(Visitor.class, 101);
		if (v==null) {
			System.out.println("No record");
		} else {
			EntityTransaction et=em.getTransaction();
			et.begin();
			em.remove(v);
			et.commit();
		}
		
	}
	
	private void removePassportRecord() 
	{
		
		EntityManagerFactory emf=null;
		EntityManager em=null;
		
		emf=Persistence.createEntityManagerFactory("JPA");
		em=emf.createEntityManager();
		
		
		Visitor v=em.find(Visitor.class, 103);
		if (v==null) {
			System.out.println("No record");
		} else {
			v.setPassport(null);
			EntityTransaction et=em.getTransaction();
			et.begin();
			em.remove(v);
			et.commit();
		}
		
	}

	public void displayVisitorPassport() 
	{
		
		EntityManagerFactory emf=null;
		EntityManager em=null;
		
		emf=Persistence.createEntityManagerFactory("JPA");
		em=emf.createEntityManager();
		
		
		Visitor v=em.find(Visitor.class, 103);
		if (v==null) {
			System.out.println("No record");
		} else {
				System.out.println(v.getVisitorId()+"--"+v.getVisitorName()+"--"+v.getPassport().getPassportNo()+"--"+v.getPassport().getDateOfExpiry());
		}
		
	}

	public static void main(String[] args) {
		//new TestDAO().addVisitor_PassportRecord();
		//new TestDAO().removeVisitor_PassportRecord();
		//new TestDAO().addPassportRecord();
		//new TestDAO().addVisitorRecord();
		//new TestDAO().removePassportRecord();
		//new TestDAO().addVisitorWithoutPassportRecord();
		new TestDAO().displayVisitorPassport();
	}


}
