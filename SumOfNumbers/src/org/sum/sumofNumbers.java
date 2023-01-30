package org.sum;
import java.util.Scanner;

public class sumofNumbers {
	public static void main(String args[]) {  
	   int num, digit, sum = 0;  
	   Scanner s1 = new Scanner(System.in);  
	   System.out.print("Enter the number: ");  
	   num = s1.nextInt();  
	   while(num > 0) 
	   {    
	      digit = num % 10;  
	      sum += digit;  
	      num /= 10;  
	   }
	System.out.println(sum); 
	s1.close();
	}  
}
