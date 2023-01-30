package org.bank;

public class AxisBank extends BankInfo{
   public void deposit() {
	   System.out.println("your deposited amount is 10,000");
   }
   
public static void main(String[] args) {
	BankInfo b1= new BankInfo();
	b1.saving();
	b1.fixed();
	b1.deposit();
	
	AxisBank a1= new AxisBank();
	a1.deposit();
}
}
