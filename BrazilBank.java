package com.vstl.oops;

public class BrazilBank extends HSBCBank {
	//Multilevel Inheritance Example :
	
	public String strBrazilBankFunds ="Income Funds";
	
	public void getBrazilBankGiveFunds() {
		 System.out.println("Brazil bank funds : "+strBrazilBankFunds);
	}
	 
	  public void getAllDeatilsOfBank() {
		  this.getUSBankAnLoan();
		  this.getUSBankGivenLoan();
		  this.getHSBCBanksGivesAnPersonalLoan();
		  this.getHSBCGivesAnBusinessLoan();
		  this.getBrazilBankGiveFunds();
	  }
	  
}	  
		  
	  