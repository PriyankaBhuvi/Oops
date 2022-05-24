package com.vstl.oops;

public class HSBCBank extends  USBank{
	//Multilevel Inheritance Example :
	
	public String strHSBCBankGivePersonalLoan ="Gold Loan";
	public String strHSBCBankBusinessLoan ="Business Loan";
	
	public void getHSBCBanksGivesAnPersonalLoan() {
		System.out.println("HSBC Bank personal Loan : "+strHSBCBankGivePersonalLoan);
		
	}
	  public void getHSBCGivesAnBusinessLoan() {
		  System.out.println("HSBC Bank business loan : "+strHSBCBankBusinessLoan);
	  }
	  
	  public void getDetailsOfBanks() {
		  this.getUSBankAnLoan();
		  this.getUSBankGivenLoan();
		  this.getHSBCBanksGivesAnPersonalLoan();
		  this.getHSBCGivesAnBusinessLoan();
	  }
}	
