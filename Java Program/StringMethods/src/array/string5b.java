package array;

import java.util.Scanner;

public class string5b {
     public static void main(String[] args) {
    	
		Scanner s1= new Scanner(System.in);
		System.out.println("Enter the address= ");
		String str=s1.nextLine();
		
		if(str.indexOf("pincode")>0)
			System.out.println("Valid Address");
		else 
			System.out.print("Invalid Address");
		s1.close();
	}
}
