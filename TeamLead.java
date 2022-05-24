package com.vstl.oops;

 public class TeamLead extends Employee implements Project {
	 
	 public void getEmployeeNameDetails() {
			this.getCompanyName();
	        this.getEmployeeName();
		}
	 
	public void strProjectName() {
		System.out.println("Project Name is square");
	}

	public void intTakenDaysToComplteTheProject() {
		System.out.println("Project Taken 30 days");
	}
	  
	public void getEmployeProjectDetails() {
		System.out.println("company name is : "+strCompanyName);
		System.out.println("My company Name is : "+strEmployeeName);
		System.out.println("Project Name is square");
		System.out.println("Project Taken 30 days");


	}
}
