package org.vote;

import java.util.Scanner;

public class Voter{
	public static void main(String[] args)
	{
	    int age;
	    Scanner s1 = new Scanner(System.in);
		System.out.print("Enter your age=");
		age = s1.nextInt();
		
	    if (age>=18)
	       System.out.println("Eligible for vote.");
	    else
	       System.out.println("Not eligible for vote.");
	    s1.close();
	        
	 }
	
}
