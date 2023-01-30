package array;

import java.util.Scanner;

public class string5d {
	 public static void main(String[] args) {
		 
	    Scanner sc = new Scanner(System.in); 
	    System.out.println("Enter the number= ");
	    String num=sc.nextLine();
	    Scanner scan = new Scanner(num);

	    if(scan.hasNextInt())
	    	 System.out.println("Valid Number");
	    else
	    	 System.out.println("Invalid Number");
	    scan.close();
	    sc.close();
	 }
} 


//public class string5d
//{ 
//	public static void main(String[] args)   
//	{ 
//		String input = "90954a6o78";           
//		try 
//		{ 
//			Integer.parseInt(input); 
//			System.out.println("Valid Number"); 
//		}  
//		catch (NumberFormatException e)  
//		{ 
//			System.out.println("Invalid Number"); 
//		} 
//	} 
//} 