package org.fact;
import java.util.Scanner;

public class factorial { 
	 public static void main(String args[])
	 {  
	  int fact=1;  
	  Scanner s1 = new Scanner(System.in);
	  System.out.print("Enter the number= " );
	  int num = s1.nextInt();
	  
	  for(int i=1; i<=num; i++){    
	      fact=fact*i;    
	  }    
	  System.out.println("Factorial of "+num+" is: "+fact);  
	  s1.close();
	 }  
}  