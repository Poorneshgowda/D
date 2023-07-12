package com.payroll.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class WFHRequest {
	 @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private int wfhId;
	
	private String fromDate;
	private String toDate;
	private String wfhDescription;
	
	@OneToOne
	private Employee employee;


	public WFHRequest() {
		super();
		// TODO Auto-generated constructor stub
	}


	public WFHRequest(String fromDate, String toDate, String wfhDescription, Employee employee) {
		super();
		this.fromDate = fromDate;
		this.toDate = toDate;
		this.wfhDescription = wfhDescription;
		this.employee = employee;
	}


	public String getFromDate() {
		return fromDate;
	}


	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}


	public String getToDate() {
		return toDate;
	}


	public void setToDate(String toDate) {
		this.toDate = toDate;
	}


	public String getWfhDescription() {
		return wfhDescription;
	}


	public void setWfhDescription(String wfhDescription) {
		this.wfhDescription = wfhDescription;
	}


	public Employee getEmployee() {
		return employee;
	}


	public void setEmployee(Employee employee) {
		this.employee = employee;
	}


	@Override
	public String toString() {
		return "WFHRequest [fromDate=" + fromDate + ", toDate=" + toDate + ", wfhDescription=" + wfhDescription
				+ ", employee=" + employee + "]";
	}
	

}
