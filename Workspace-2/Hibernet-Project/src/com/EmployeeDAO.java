package com;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeDAO {

	public void addEmployee(int eid,String ename) 
	{
	
		SessionFactory factory=null;
		Session session=null;
		Integer count=null;
		
		try {
			factory =new Configuration().configure().buildSessionFactory();
			session =factory.openSession();
			
			Employee1 employee=new Employee1();
			employee.setEmpId(eid);
			employee.setEmpName(ename);
			
			Transaction tx=session.beginTransaction();
			count= (Integer) session.save(employee);
			tx.commit();
			
		} catch (Exception e) {
			System.out.println(e);
		}finally {
			session.close();
			System.out.println("Employee ID : "+count);
		}
	}
	
	
	public void getEmployeeById(int eid) 
	{
		
		SessionFactory factory=null;
		Session session=null;
		Integer count=null;
		
		try {
			factory =new Configuration().configure().buildSessionFactory();
			session =factory.openSession();
			
			Employee1 emp=(Employee1) session.get(Employee1.class, eid);
			if (emp==null) 
			{
				System.out.println("Employee not found!");
			}
			else {
				System.out.println(emp.getEmpId()+"  --  "+emp.getEmpName());
			}
			
			
		} catch (Exception e) {
			System.out.println(e);
		}finally {
			session.close();
			//System.out.println("Employee ID : "+count);
		}
	}
	
	
	public void getAllEmployee() 
	{
		
		SessionFactory factory=null;
		Session session=null;
		Integer count=null;
		
		try {
			factory =new Configuration().configure().buildSessionFactory();
			session =factory.openSession();
			
			
			List<Employee1> empList=session.createQuery("from Employee1").list();
			
			for (Employee1 emp : empList) {
				System.out.println(emp.getEmpId()+"  --  "+emp.getEmpName());
			}
			
				
			
			
			
		} catch (Exception e) {
			System.out.println(e);
			throw new ExceptionInInitializerError(e);
		}finally {
			session.close();
			//System.out.println("Employee ID : "+count);
		}
	}
	
	public void removeEmployee(int eid) 
	{
		
		SessionFactory factory=null;
		Session session=null;
		Integer count=null;
		
		try {
			factory =new Configuration().configure().buildSessionFactory();
			session =factory.openSession();
			
			Employee1 emp=(Employee1) session.get(Employee1.class, eid);
			if (emp==null) 
			{
				System.out.println("Employee not found!");
			}
			else {
				Transaction tx=session.beginTransaction();
				session.delete(emp);
				tx.commit();
				System.out.println(emp.getEmpId()+"  --  "+emp.getEmpName());
			}
			
			
		} catch (Exception e) {
			System.out.println(e);
		}finally {
			session.close();
			//System.out.println("Employee ID : "+count);
		}
	}
	
	public void updateEmployee(int eid,String ename) 
	{
		
		SessionFactory factory=null;
		Session session=null;
		Integer count=null;
		
		try {
			factory =new Configuration().configure().buildSessionFactory();
			session =factory.openSession();
			
			Employee1 emp=(Employee1) session.get(Employee1.class, eid);
			if (emp==null) 
			{
				System.out.println("Employee not found!");
			}
			else {
				Transaction tx=session.beginTransaction();
				emp.setEmpName(ename);
				tx.commit();
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}finally {
			session.close();
			//System.out.println("Employee ID : "+count);
		}
	}
	
	
	public static void main(String[] args) {
		//new EmployeeDAO().addEmployee(103,"ajit");
		//new EmployeeDAO().getEmployeeById(102);
		//new EmployeeDAO().updateEmployee(102, "rajesh");
		//new EmployeeDAO().removeEmployee(101);
		new EmployeeDAO().getAllEmployee();
	}
}
