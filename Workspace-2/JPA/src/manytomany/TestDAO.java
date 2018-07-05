package manytomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestDAO {

	
	
	 void addRecord() 
	{
		
		EntityManagerFactory emf=null;
		EntityManager em=null;
		
		emf=Persistence.createEntityManagerFactory("JPA");
		em=emf.createEntityManager();
		
		Account1 account1=new Account1();
		account1.setAccId(101);
		account1.setAccType("Saving");
		account1.setBalance(500000);
		
		Account1 account2=new Account1();
		account2.setAccId(102);
		account2.setAccType("Saving");
		account2.setBalance(100000);
		
		List<Account1> accList=new ArrayList<Account1>();
		accList.add(account1);
		accList.add(account2);
		
		Customer1 customer1=new Customer1();
		customer1.setcId(1);
		customer1.setcName("Mark");
		customer1.setAccList(accList);
		
		EntityTransaction et=em.getTransaction();
		et.begin();
		em.persist(customer1);
		et.commit();
		
	}

	 void display() 
		{
			
			EntityManagerFactory emf=null;
			EntityManager em=null;
			
			emf=Persistence.createEntityManagerFactory("JPA");
			em=emf.createEntityManager();
			
			Customer1 customer1=em.find(Customer1.class, 1);
			System.out.println(customer1.getcId()+"--"+customer1.getcName());
			
			List<Account1> accList=customer1.getAccList();
			for (Account1 a : accList) {
				System.out.println(a.getAccId()+"--"+a.getAccType()+"--"+a.getBalance());
			}
			
			
		}
	 
	
	
	public static void main(String[] args) {
		//new TestDAO().addRecord();
		new TestDAO().display();
		//new TestDAO().
		//new TestDAO().
		//new TestDAO().
		
	}

}
