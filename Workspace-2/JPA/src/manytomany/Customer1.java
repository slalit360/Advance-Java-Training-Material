package manytomany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity 
public class Customer1 {

	@Id
	@Column(name="cid")
	int cId;
	
	@Column(name="cname")
	String cName;
	
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="customer_account" ,joinColumns={@JoinColumn(name="custid")}, inverseJoinColumns={@JoinColumn(name="accid")})
	List<Account1> accList;
	 
	public List<Account1> getAccList() {
		return accList;
	}
	public void setAccList(List<Account1> accList) {
		this.accList = accList;
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
	
}
