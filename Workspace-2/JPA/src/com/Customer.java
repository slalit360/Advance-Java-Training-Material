package com;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



//@NamedQuery(name="findCust", query="select c from Customer c")

@NamedQueries({@NamedQuery(name="find", query="select c from Customer c"),
		@NamedQuery(name="findBySalary", query="select c from Customer c where c.salary<?1 and c.salary>?2")})

@Entity
@Table(name="customer")
public class Customer {

	@Id
	@Column(name="cid",precision=5)
	private int cId;
	
	@Column(name="cname",length=20)
	private String cName;
	
	//@Column(precision=8,scale=2) works in oracle only
	private double salary;
	
	@Temporal(TemporalType.DATE)
	private Date dob;

	
	@Override
	public String toString() {
		return "Customer [cId=" + cId + ", cName=" + cName + "]";
	}

	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	
	
	
}
