package org.company;

public class CompanyInfo {
     void companyName() {
    	 System.out.println("Tekizma");
     }
     
     void companyId() {
    	 System.out.println("12345");
     }
     
     void companyAddress() {
    	 System.out.println("Bengaluru");
     }
     
public static void main(String[] args) {
	CompanyInfo c1=new CompanyInfo();
	c1.companyName();
	c1.companyId();
	c1.companyAddress();
}
}
