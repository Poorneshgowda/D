package com.payroll.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class LeaveDetails {
	

		
		 @Id
		  @GeneratedValue(strategy = GenerationType.IDENTITY)
		  private int leaveId;
		 private String fromDate;
		 private String toDate;
		 private String leaveType;
		 
		 @OneToOne
		 private Employee employee;

		public LeaveDetails() {
			super();
			// TODO Auto-generated constructor stub
		}

		public LeaveDetails(int leaveId, String fromDate, String toDate, String leaveType, Employee employee) {
			super();
			this.leaveId = leaveId;
			this.fromDate = fromDate;
			this.toDate = toDate;
			this.leaveType = leaveType;
			this.employee = employee;
		}

		public int getLeaveId() {
			return leaveId;
		}

		public void setLeaveId(int leaveId) {
			this.leaveId = leaveId;
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

		public String getLeaveType() {
			return leaveType;
		}

		public void setLeaveType(String leaveType) {
			this.leaveType = leaveType;
		}

		public Employee getEmployee() {
			return employee;
		}

		public void setEmployee(Employee employee) {
			this.employee = employee;
		}

		@Override
		public String toString() {
			return "LeaveDetails [leaveId=" + leaveId + ", fromDate=" + fromDate + ", toDate=" + toDate + ", leaveType="
					+ leaveType + ", employee=" + employee + "]";
		}
		 
		 

		
}
