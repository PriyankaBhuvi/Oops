package com.vstl.oops;

public class Hyundai extends MarutiSWiftCar{
	
	public int intMarutiSWiftCarWheel=4;
	public String strMarutiSWiftCarRefuel="Refuel";
	public String strMarutiSWiftCarEngine="Engine";

	public void getMarutiSWiftCarWheelCount() {
		
		System.out.println("MarutiSWiftCar wheel is : "+intMarutiSWiftCarWheel);
		
	}
    public void getMarutiSWiftCarRefuel() {
    	System.out.println("MarutiSWiftCar Refuel : "+strMarutiSWiftCarRefuel);
    }
    
    public void getMarutiSWiftCarEngine() {
    	System.out.println("MarutiSWiftCarRe Engine : "+strMarutiSWiftCarEngine);
    }
     
    public void getHyundaiCarDetail() {
    	 this.getMarutiSWiftCarWheelCount();
    	 this.getMarutiSWiftCarRefuel();
    	 this.getMarutiSWiftCarEngine();
    }
}
