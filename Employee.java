package com.vstl.oops;

public class Employee extends Company { 
	 
public String strEmployeeName="Priya";
	
	public void getEmployeeName() {
		System.out.println("My company Name is : "+strEmployeeName);
	
	
	}
	public void getEmployeeNameDetails() {
		this.getCompanyName();
		this.getCompanyTotalBranch();
		this.getEmployeeName();
	}
}
