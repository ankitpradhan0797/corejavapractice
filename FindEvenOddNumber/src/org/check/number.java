package org.check;
import java.util.Scanner;

public class number {
   public static void main(String[] args)
   {
	 Scanner s1 = new Scanner(System.in);
	 System.out.print("Enter the number=" );
	 int num = s1.nextInt();
	 
	 if(num%2==0)
		System.out.println("Even Number");
	 else
		 System.out.println("Odd Number");
	 s1.close();
   }
}