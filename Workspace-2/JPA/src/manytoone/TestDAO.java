package manytoone;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestDAO {

	
	
	 void addEmpDept(int empId,String empName, int deptId,String deptName) 
	{
		
		EntityManagerFactory emf=null;
		EntityManager em=null;
		
		emf=Persistence.createEntityManagerFactory("JPA");
		em=emf.createEntityManager();
		
		Department d=new Department();
		d.setDeptId(deptId);
		d.setDeptName(deptName);
		
		Employee1 e=new Employee1();
		e.setEmpId(empId);
		e.setEmpName(empName);
		e.setDepartment(d);
		
		EntityTransaction et=em.getTransaction();
		et.begin();
		em.persist(e);
		et.commit();
		
	}
	
	 void addEmpWithoutDept(int empId,String empName, int deptId) 
	{
		
		EntityManagerFactory emf=null;
		EntityManager em=null;
		
		emf=Persistence.createEntityManagerFactory("JPA");
		em=emf.createEntityManager();
		
		Department d=em.find(Department.class, deptId);
		Employee1 e=new Employee1();
		e.setEmpId(empId);
		e.setEmpName(empName);
		e.setDepartment(d);
		
		EntityTransaction et=em.getTransaction();
		
		et.begin();
		em.persist(e);
		et.commit();
		
	}
	
	 void removeEmpDept(int empId) 
	{
		
		EntityManagerFactory emf=null;
		EntityManager em=null;
		
		emf=Persistence.createEntityManagerFactory("JPA");
		em=emf.createEntityManager();
		
		Employee1 e=em.find(Employee1.class, empId);
		
		if (e==null) {
			System.out.println("No record");
		} else {
			EntityTransaction et=em.getTransaction();
			et.begin();
			em.remove(e);
			et.commit();
		}
		
	}
	
	 void removedept(int deptId) 
	{
		

		EntityManagerFactory emf=null;
		EntityManager em=null;
		
		emf=Persistence.createEntityManagerFactory("JPA");
		em=emf.createEntityManager();
		
		Department e=em.find(Department.class, deptId);
		
		if (e==null) {
			System.out.println("No record");
		} else {
			EntityTransaction et=em.getTransaction();
			et.begin();
			em.remove(e);
			et.commit();
		}
		
	}

	 void updateEmpDept(int empId, String deptName) 
	 {
		 	EntityManagerFactory emf=null;
			EntityManager em=null;
			
			emf=Persistence.createEntityManagerFactory("JPA");
			em=emf.createEntityManager();
			
			Employee1 e=em.find(Employee1.class, empId);
			
			Department d=e.getDepartment();
			d.setDeptName(deptName);
			
			//e.setDepartment(d);
			
			EntityTransaction et=em.getTransaction();
			et.begin();
			em.persist(e);
			et.commit();
			
			
	 }
	
	public static void main(String[] args) {
		//new TestDAO().addEmpDept(103, "ABC", 20, "JAVA");
		//new TestDAO().addEmpWithoutDept(103, "lucky", 20);
		//new TestDAO().removeEmpDept(103);
		//new TestDAO().removedept(10);
		new TestDAO().updateEmpDept(101	, "ADV_JAVA1");
		
	}

}
