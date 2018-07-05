package com;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

@Component
public class EmployeeDAO {
	
	private EntityManager em;
	
	@PersistenceContext
	public void setEntityManager(EntityManager entityManager) {
		System.out.println("here we are calling setter");
		this.em = entityManager;
	}
	
	
	
	@Transactional
	public void insertEmployeeRecord(){
	
		Employee emp=new Employee();
		emp.setEmpId(558);
		emp.setEmpName("Jack");
		em.persist(emp);
		
		
		/*EntityManagerFactory emf=Persistence.createEntityManagerFactory("MyDemo");
		EntityManager em=emf.createEntityManager();
			
		
		EntityTransaction et=em.getTransaction();
		et.begin();
		em.persist(emp);
						
		//et.commit(); */
		
		
	}
	
	@Transactional
	public void updateEmployeerecord(){
		Employee emp=em.find(Employee.class, 556);
		emp.setEmpName("AAA");
	}
	
	
}

