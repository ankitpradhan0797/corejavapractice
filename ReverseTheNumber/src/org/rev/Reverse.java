package org.rev;

public class Reverse {
	public static void main(String[] args) {  
	  int rem, num = 123, rev = 0;  
	  while(num != 0) 
	  {  
	     rem = num % 10;  
	     rev = rev * 10 + rem;  
	     num = num/10;  
	  }  
	System.out.println("Reverse of the given number is: "+rev);  
	}  
}
