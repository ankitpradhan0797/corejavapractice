package org.bank;

public class BankInfo extends AxisBank {
  public void saving() {
	  System.out.println("Press 1 to open saving account");
  }
  
  public void fixed(){
	  System.out.println("press 2 to open fixed account");
  }
  
public static void main(String[] args) {
	BankInfo b1=new BankInfo();
	b1.saving();
	b1.fixed();
	
	AxisBank a1=new AxisBank();
	a1.deposit();
 }  
}
