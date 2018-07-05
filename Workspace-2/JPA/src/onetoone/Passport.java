package onetoone;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Passport {

	@Id
	private String passportNo;
	
	@Temporal(TemporalType.DATE)
	private Date dateOfExpiry;
	
	public String getPassportNo() {
		return passportNo;
	}
	public void setPassportNo(String s) {
		this.passportNo = s;
	}
	public Date getDateOfExpiry() {
		return dateOfExpiry;
	}
	public void setDateOfExpiry(Date dateOfExpiry) {
		this.dateOfExpiry = dateOfExpiry;
	}
}
