package org.company;

import org.client.Client;

public class Company extends Client {
   public void companyName() {
	   System.out.println("Tekizma");
   }
   
public static void main(String[] args) {
	Company c1=new Company();
	c1.companyName();
	
	Client c2=new Client();
	c2.clientName();
}
}
