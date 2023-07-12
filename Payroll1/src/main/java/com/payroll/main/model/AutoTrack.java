package com.payroll.main.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;



@Entity
public class AutoTrack {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int autoId;

  private  LocalDate date;
  private String inTime;
  private String outTime;
  private String attendedHrs;
  private String totalHrs;
  private String shortFall;
  private String excessTime;
  
  @OneToOne
  private Employee employee;

public AutoTrack() {
	super();
	// TODO Auto-generated constructor stub
}
public AutoTrack(int autoId, LocalDate date, String inTime, String outTime, String attendedHrs, String totalHrs,
		String shortFall, String excessTime, Employee employee) {
	super();
	this.autoId = autoId;
	this.date = date;
	this.inTime = inTime;
	this.outTime = outTime;
	this.attendedHrs = attendedHrs;
	this.totalHrs = totalHrs;
	this.shortFall = shortFall;
	this.excessTime = excessTime;
	this.employee = employee;
}


public int getAutoId() {
	return autoId;
}

public void setAutoId(int autoId) {
	this.autoId = autoId;
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

public String getShortFall() {
	return shortFall;
}

public void setShortFall(String shortFall) {
	this.shortFall = shortFall;
}

public String getExcessTime() {
	return excessTime;
}

public void setExcessTime(String excessTime) {
	this.excessTime = excessTime;
}

public Employee getEmployee() {
	return employee;
}

public void setEmployee(Employee employee) {
	this.employee = employee;
}



@Override
public String toString() {
	return "AutoTrack [autoId=" + autoId + ", date=" + date + ", inTime=" + inTime + ", outTime=" + outTime
			+ ", attendedHrs=" + attendedHrs + ", totalHrs=" + totalHrs + ", shortFall=" + shortFall + ", excessTime="
			+ excessTime + ", employee=" + employee + "]";
}

}
