package org.prime;

import java.util.Scanner;

public class Prime {
   public static void main(String[] args) {
	   
	  boolean isPrime=true;
	  
	  Scanner s1=new Scanner(System.in);
	  System.out.println("Enter a Number= ");
	  int num= s1.nextInt();
	  
	  for(int i=2; i<=num/2; i++) 
	  {
		  int temp=num%i;
		  if(temp==0){
		     isPrime=false;
		     break;
		   }
	  }
	  if(isPrime)
		 System.out.println(num + " is a Prime Number");
	  else
		 System.out.println(num + " is not a Prime Number");
	  s1.close();
   }
}
