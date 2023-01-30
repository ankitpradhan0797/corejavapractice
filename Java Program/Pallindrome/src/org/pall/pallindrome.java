package org.pall;
import java.util.Scanner;

public class pallindrome {
	public static void main(String args[]){  
		int rem,sum=0,temp;    
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the Number= ");
		int n=s1.nextInt();
		temp=n; 
		
		while(n>0){    
		   rem=n%10; 
		   sum=(sum*10)+rem;    
		   n=n/10;    
		}    
		if(temp==sum)    
		   System.out.println("Palindrome");    
		else    
		   System.out.println("Not Palindrome");   
		s1.close();
    }  
}
