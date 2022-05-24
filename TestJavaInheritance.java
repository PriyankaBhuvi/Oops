package com.vstl.oops;

public class TestJavaInheritance {

	public static void main(String[] args) {
		//single inheritance :
		Car objCar = new Car();
		objCar.getStartCar();
		objCar.getStopCar();
		objCar.getrefuelCar();
	
		System.out.println("************");
	

   //Multilevel Inheritance :
		BrazilBank objBrazilBank = new BrazilBank();
		 objBrazilBank.getAllDeatilsOfBank();
		
		System.out.println("*****************");
		
	 //Hierarchical  Inheritance :	
		MarutiSWiftCar objMarutiSWiftCar =new MarutiSWiftCar();
		objMarutiSWiftCar.getAllMarutiSWiftCarDetails();
		
		System.out.println("***************");
			
	//Multiple Inheritance :
		Student objStudent = new Student();
		objStudent.intTotalStudent();
        objStudent.strName();
        objStudent.strHobbies();
        objStudent.intTotalGirls();
        objStudent.strSubject();
        
        System.out.println("***************");   
    //Hybrid Inheritance :-
        TeamLead objTeamLead = new TeamLead();
        objTeamLead.getEmployeProjectDetails();
        
	}
	
}	
   
	  

        