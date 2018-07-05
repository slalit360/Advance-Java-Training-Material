package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import com.Test;

public class TestDAO {
	
	public void test() 
	{
		EntityManagerFactory emf=null;
		EntityManager em=null;
		
		emf=Persistence.createEntityManagerFactory("JPA");
		em=emf.createEntityManager();
		
		Test test=new Test();
		test.setDescription("OnlyData");
		
		EntityTransaction et=em.getTransaction();
		et.begin();
		em.persist(test);
		et.commit();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new TestDAO().test();
	}

}
