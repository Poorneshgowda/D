package com.payroll.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class Payroll {
	 @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private int payrollId;
	private String paySlip;
	private String taxCAlculator;
	private String Forms;
	
	@OneToOne
	private Employee employee;

	public Payroll() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Payroll(int payrollId, String paySlip, String taxCAlculator, String forms, Employee employee) {
		super();
		this.payrollId = payrollId;
		this.paySlip = paySlip;
		this.taxCAlculator = taxCAlculator;
		Forms = forms;
		this.employee = employee;
	}

	public int getPayrollId() {
		return payrollId;
	}

	public void setPayrollId(int payrollId) {
		this.payrollId = payrollId;
	}

	public String getPaySlip() {
		return paySlip;
	}

	public void setPaySlip(String paySlip) {
		this.paySlip = paySlip;
	}

	public String getTaxCAlculator() {
		return taxCAlculator;
	}

	public void setTaxCAlculator(String taxCAlculator) {
		this.taxCAlculator = taxCAlculator;
	}

	public String getForms() {
		return Forms;
	}

	public void setForms(String forms) {
		Forms = forms;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Payroll [payrollId=" + payrollId + ", paySlip=" + paySlip + ", taxCAlculator=" + taxCAlculator
				+ ", Forms=" + Forms + ", employee=" + employee + "]";
	}



}
