package com.payroll.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

	
@Entity
public class Employee {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private long employeeId;
		
		private String employyeName;
		private int age;
		private String dob;
		private String address;
		private String maritialStatus;
		private long phoneNo;
		private String birthPlace;
		
		private String bankName;
		private String acNo;
		private String ifscCode;
		private String accType;
		private String bankBranchName;
		private String bankAddress;
		
		private String panNo;
		private long adharNo;
		private String passportNo;
		
		public Employee(long employeeId, String employyeName, int age, String dob, String address, String maritialStatus,
				long phoneNo, String birthPlace, String bankName, String acNo, String ifscCode, String accType,
				String bankBranchName, String bankAddress, String panNo, long adharNo, String passportNo) {
			super();
			this.employeeId = employeeId;
			this.employyeName = employyeName;
			this.age = age;
			this.dob = dob;
			this.address = address;
			this.maritialStatus = maritialStatus;
			this.phoneNo = phoneNo;
			this.birthPlace = birthPlace;
			this.bankName = bankName;
			this.acNo = acNo;
			this.ifscCode = ifscCode;
			this.accType = accType;
			this.bankBranchName = bankBranchName;
			this.bankAddress = bankAddress;
			this.panNo = panNo;
			this.adharNo = adharNo;
			this.passportNo = passportNo;
		}

		public Employee() {
			super();
			// TODO Auto-generated constructor stub
		}

		public long getEmployeeId() {
			return employeeId;
		}

		public void setEmployeeId(long employeeId) {
			this.employeeId = employeeId;
		}

		public String getEmployyeName() {
			return employyeName;
		}

		public void setEmployyeName(String employyeName) {
			this.employyeName = employyeName;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public String getDob() {
			return dob;
		}

		public void setDob(String dob) {
			this.dob = dob;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getMaritialStatus() {
			return maritialStatus;
		}

		public void setMaritialStatus(String maritialStatus) {
			this.maritialStatus = maritialStatus;
		}

		public long getPhoneNo() {
			return phoneNo;
		}

		public void setPhoneNo(long phoneNo) {
			this.phoneNo = phoneNo;
		}

		public String getBirthPlace() {
			return birthPlace;
		}

		public void setBirthPlace(String birthPlace) {
			this.birthPlace = birthPlace;
		}

		public String getBankName() {
			return bankName;
		}

		public void setBankName(String bankName) {
			this.bankName = bankName;
		}

		public String getAcNo() {
			return acNo;
		}

		public void setAcNo(String acNo) {
			this.acNo = acNo;
		}

		public String getIfscCode() {
			return ifscCode;
		}

		public void setIfscCode(String ifscCode) {
			this.ifscCode = ifscCode;
		}

		public String getAccType() {
			return accType;
		}

		public void setAccType(String accType) {
			this.accType = accType;
		}

		public String getBankBranchName() {
			return bankBranchName;
		}

		public void setBankBranchName(String bankBranchName) {
			this.bankBranchName = bankBranchName;
		}

		public String getBankAddress() {
			return bankAddress;
		}

		public void setBankAddress(String bankAddress) {
			this.bankAddress = bankAddress;
		}

		public String getPanNo() {
			return panNo;
		}

		public void setPanNo(String panNo) {
			this.panNo = panNo;
		}

		public long getAdharNo() {
			return adharNo;
		}

		public void setAdharNo(long adharNo) {
			this.adharNo = adharNo;
		}

		public String getPassportNo() {
			return passportNo;
		}

		public void setPassportNo(String passportNo) {
			this.passportNo = passportNo;
		}

		@Override
		public String toString() {
			return "Employee [employeeId=" + employeeId + ", employyeName=" + employyeName + ", age=" + age + ", dob=" + dob
					+ ", address=" + address + ", maritialStatus=" + maritialStatus + ", phoneNo=" + phoneNo
					+ ", birthPlace=" + birthPlace + ", bankName=" + bankName + ", acNo=" + acNo + ", ifscCode=" + ifscCode
					+ ", accType=" + accType + ", bankBranchName=" + bankBranchName + ", bankAddress=" + bankAddress
					+ ", panNo=" + panNo + ", adharNo=" + adharNo + ", passportNo=" + passportNo + "]";
		}
		
}

