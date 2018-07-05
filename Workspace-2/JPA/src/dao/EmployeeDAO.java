package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.Employee;

public class EmployeeDAO {

	
	public void addEmployee(int eid,String ename) 
	{
	
		EntityManagerFactory emf=null;
		EntityManager em=null;
		
		emf=Persistence.createEntityManagerFactory("JPA");
		em=emf.createEntityManager();
		
		Employee e=new Employee();
		e.setEmpId(eid);
		e.setEmpName(ename);
		
		EntityTransaction et=em.getTransaction();
		et.begin();
		em.persist(e);
		et.commit();
		
	}
	
	public void getEmployeeById(int eid) 
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPA");
		EntityManager em=emf.createEntityManager();
		
			Employee emp=em.find(Employee.class, eid);
			if (emp==null) 
			{
				System.out.println("Employee not found!");
			}
			else {
				System.out.println(emp.getEmpId()+"  --  "+emp.getEmpName());
			}
			
			em.close();
		
	}
	
	public void updateEmployeed(int eid,String ename) 
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPA");
		EntityManager em=emf.createEntityManager();
		
		Employee emp=em.find(Employee.class, eid);
		
		if (emp==null) 
			{
				System.out.println("Employee not found!");
			}
		else {

				EntityTransaction et=em.getTransaction();
				et.begin();
				emp.setEmpName(ename);
				et.commit();
				System.out.println(emp.getEmpId()+"  --  "+emp.getEmpName());
				
			}
			
			em.close();
		
	}
	
	public void deleteEmployeed(int eid) 
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPA");
		EntityManager em=emf.createEntityManager();
		
		Employee emp=em.find(Employee.class, eid);
		
		if (emp==null) 
			{
				System.out.println("Employee not found!");
			}
		else {

				EntityTransaction et=em.getTransaction();
				et.begin();
				em.remove(emp);
				et.commit();
				System.out.println(emp.getEmpId()+"  --  "+emp.getEmpName());
				
			}
			
			em.close();
		
	}
	
	public void mergeEmployee(int eid,String ename)
	{
		EntityManagerFactory emf=null;
		EntityManager em=null;
		
		emf=Persistence.createEntityManagerFactory("JPA");
		em=emf.createEntityManager();
		
		Employee e=new Employee();
		e.setEmpId(eid);
		e.setEmpName(ename);
		
		EntityTransaction et=em.getTransaction();
		et.begin();
		em.merge(e);
		et.commit();
	} 
	
	
	public static void main(String[] args) {
		//new EmployeeDAO().addEmployee(101,"Mark");
		//new EmployeeDAO().getEmployeeById(101);
		//new EmployeeDAO().updateEmployeed(101, "Suthar");
		//new EmployeeDAO().deleteEmployeed(101);
		new EmployeeDAO().mergeEmployee(101, "Suthar");

	}

}
