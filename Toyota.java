package com.vstl.oops;

public class Toyota extends MarutiSWiftCar{
	public String strMarutiSWiftCarStart="Start";
	public String strMarutiSWiftCarStop="Stop";
	
	public void getMarutiSWiftCarStart() {
		
		System.out.println("MarutiSWiftCar get Start : "+strMarutiSWiftCarStart);
		
	}
	 public void getMarutiSWiftCarStop() {
		 
		 System.out.println("MarutiSWiftCar get Stop : " +strMarutiSWiftCarStop);
	 }

	 public void getToyotaDetail() {
		 this.getMarutiSWiftCarStart();
		 this.getMarutiSWiftCarStop();
	 }
}
