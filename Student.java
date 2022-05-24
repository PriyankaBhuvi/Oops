package com.vstl.oops;

public class Student implements Commerce,Arts {
	//overriding  from commerce :
	public void intTotalStudent() {
		 System.out.println("Total Student");
		 
	 }
	
	public void strName() {
		System.out.println("Student Name is priya");
	}
	
   public void strHobbies() {
   	System.out.println("student hobbie is singing");
   	
   }
   
   //overriding  from Arts :
    public void intTotalGirls() {
   	 System.out.println("Student totalgirls");
   	 
    }
    
    public void strSubject() {
   	 System.out.println("Student Subject");
   	 
    }
    
}



