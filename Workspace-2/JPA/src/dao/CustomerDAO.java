package dao;

import java.util.Date;
import java.util.List;
import javax.persistence.Query;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.Customer;

public class CustomerDAO {

	
	public void addCustomer() 
	{
	
		EntityManagerFactory emf=null;
		EntityManager em=null;
		
		try {
			emf=Persistence.createEntityManagerFactory("JPA");
			em=emf.createEntityManager();
			
			Customer c=new Customer();
			c.setcId(103);
			c.setcName("suthar");
			c.setSalary(24000);
			c.setDob(new Date());
			
			
			EntityTransaction et=em.getTransaction();
			et.begin();
			em.persist(c);
			et.commit();
			
		} catch (Exception e) {
			System.out.println(e);
		}
		finally {
			em.close();
		}
	}
	
	public void displayAllCustomer() 
	{
		EntityManagerFactory emf=null;
		EntityManager em=null;
		
			emf=Persistence.createEntityManagerFactory("JPA");
			em=emf.createEntityManager();
			

			/*Query query=em.createQuery("Select c from Customer c");  // using Customer List object
			List<Customer>cList=query.getResultList();
			
			for (Customer customer : cList) {
				System.out.println(customer.getcId()+"--"+customer.getcName()+"--"+customer.getDob()+"--"+customer.getSalary());
			}*/
			
			/*Query query=em.createQuery("Select c.cName from Customer c");  // using String List object for cName
			List<String>cList=query.getResultList();
			
			for (String customer : cList) {
				//System.out.println(customer.getcName());
				System.out.println(customer);
			}*/
			
			/*Query query=em.createQuery("Select c.cId, c.cName from Customer c where c.cId="+101);  // using object List object which List of array
			List<Object[]>objList=query.getResultList();
			
			for (Object[] customer : objList) 
			{
				System.out.println(customer[0]+"***************"+customer[1]);
			}*/
			
			
			/*Query query=em.createQuery("Select c from Customer c where c.cId="+101+" or c.salary>"+25000);  // using object List object which List of array
			
			Query query1=em.createQuery("Select c from Customer c where c.salary<:maxval and c.salary>:minval");
			query1.setParameter("maxval", 30000.0);
			query1.setParameter("minval", 23000.0);
			
			Query query2=em.createQuery("Select c from Customer c where c.salary<?1 and c.salary>?2");
			query2.setParameter(1, 30000.0);
			query2.setParameter(2, 23000.0);
			
			Query query3=em.createNativeQuery("select * from customer");
			
			
			List<Customer>objList=query3.getResultList();
			
			for (Customer customer : objList) 
			{
				System.out.println(customer);
				//System.out.println(customer.getcId()+"***"+customer.getcName()+"***"+customer.getDob()+"***"+customer.getSalary());
			}*/
			
			 /*Query q=em.createNamedQuery("find");
			
			 List<Customer> list=q.getResultList();

			 for (Customer customer : list) {
				
				 System.out.println(customer.getcId()+"--"+customer.getcName());
			}*/
			 
			 
			 
			 Query q=em.createNamedQuery("findBySalary");
			 q.setParameter(2,12000.0);
			 q.setParameter(1,50000.0);
				
			 List<Customer> list=q.getResultList();
			 
			 for (Customer customer : list) {
				System.out.println(customer.getcId()+"--"+customer.getcName());
			}
			
	}
	
	public void count() 
	{
		
		EntityManagerFactory emf=null;
		EntityManager em=null;
		
			emf=Persistence.createEntityManagerFactory("JPA");
			em=emf.createEntityManager();

			Query query3=em.createQuery("Select count(*) from Customer");
			long l=(long) query3.getSingleResult();
			System.out.println("Count : "+l);

	}
	
	
	public void updateRecord() 
	{
		EntityManagerFactory emf=null;
		EntityManager em=null;
		
			emf=Persistence.createEntityManagerFactory("JPA");
			em=emf.createEntityManager();
			
			Query  query=em.createQuery("update Customer set salary=salary+100 ");
			
			Query  query1=em.createQuery("update Customer c set c.salary=c.salary+:newsal where c.id=?1");
			query1.setParameter("newsal", 1001.0);
			query1.setParameter(1, 101);
			
			
			EntityTransaction et=em.getTransaction();
			et.begin();
			System.out.println(query.executeUpdate());
			et.commit();
			
	}
	
	
	public void deleteRecord() 
	{
		EntityManagerFactory emf=null;
		EntityManager em=null;
		
			emf=Persistence.createEntityManagerFactory("JPA");
			em=emf.createEntityManager();
			
			Query  query=em.createQuery("delete from Customer where cid=?1");
			query.setParameter(1, 101);
			
			EntityTransaction et=em.getTransaction();
			et.begin();
			System.out.println("Deleted : "+query.executeUpdate());
			et.commit();
			
	}
	
	
	
	
	public static void main(String[] args) {
		new CustomerDAO().displayAllCustomer();
		//new CustomerDAO().updateRecord();
		//new CustomerDAO().deleteRecord();

	}

}
