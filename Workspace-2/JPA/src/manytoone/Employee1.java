package manytoone;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="employee1")
public class Employee1 {
	
	@Id
	@Column(name="empid")
	int empId;
	
	@Column(name="empname",length=15)
	String empName;
	
	//@Column(name="dept")
	@ManyToOne(cascade=CascadeType.ALL,targetEntity=Department.class)
	@JoinColumn(name="dept")
	Department department;
	
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	

}
