package com.collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Customer {
	
	private List<Loan> loanList;
	private Set loanSets;
	private Map loanMaps;
	
	public List getLoanList() {
		return loanList;
	}
	public void setLoanList(List loanList) {
		this.loanList = loanList;
	}
	public Set getLoanSets() {
		return loanSets;
	}
	public void setLoanSets(Set loanSets) {
		this.loanSets = loanSets;
	}
	public Map getLoanMaps() {
		return loanMaps;
	}
	public void setLoanMaps(Map loanMaps) {
		this.loanMaps = loanMaps;
	}
	
	

	
	
}
