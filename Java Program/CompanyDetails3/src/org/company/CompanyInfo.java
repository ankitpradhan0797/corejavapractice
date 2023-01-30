package org.company;

public class CompanyInfo {
	
	//  Based on different Number of arguments
    public void companyName(int a , int b) {
    	System.out.println(a+b);
    }
    
    public void companyName(int a , int b, int c) {
    	System.out.println(a+b+c);
    }

    public static void main(String[] args) {
		CompanyInfo c=new CompanyInfo();
		c.companyName(20, 20);
		c.companyName(10, 20, 30);
	}
}
