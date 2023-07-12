package com.payroll.main.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class ManualTrack {
	 @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private int manualId;
	 private  LocalDate date;
	 private String inTime;
	 private String outTime;
	 private String attendedHrs;
	 private String totalHrs;
	 @OneToOne
	 private Employee employee;

	public ManualTrack() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ManualTrack(int manualId, LocalDate date, String inTime, String outTime, String attendedHrs, String totalHrs,
			Employee employee) {
		super();
		this.manualId = manualId;
		this.date = date;
		this.inTime = inTime;
		this.outTime = outTime;
		this.attendedHrs = attendedHrs;
		this.totalHrs = totalHrs;
		this.employee = employee;
	}

	public int getManualId() {
		return manualId;
	}

	public void setManualId(int manualId) {
		this.manualId = manualId;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getInTime() {
		return inTime;
	}

	public void setInTime(String inTime) {
		this.inTime = inTime;
	}

	public String getOutTime() {
		return outTime;
	}

	public void setOutTime(String outTime) {
		this.outTime = outTime;
	}

	public String getAttendedHrs() {
		return attendedHrs;
	}

	public void setAttendedHrs(String attendedHrs) {
		this.attendedHrs = attendedHrs;
	}

	public String getTotalHrs() {
		return totalHrs;
	}

	public void setTotalHrs(String totalHrs) {
		this.totalHrs = totalHrs;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "ManualTrack [manualId=" + manualId + ", date=" + date + ", inTime=" + inTime + ", outTime=" + outTime
				+ ", attendedHrs=" + attendedHrs + ", totalHrs=" + totalHrs + ", employee=" + employee + "]";
	}

	
	  
}
