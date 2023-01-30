package org.pattern;

public class Pattern2 {
  public static void main(String args[]) {           
	int i, j, row = 6;  
	
	for (i=0; i<row; i++) {  // for printing rows
		
	   for (j=row-i; j>1; j--){  // for printing space between 2 stars
	      System.out.print(" ");   
	   }     
	for (j=0; j<=i; j++ ) {    // for printing columns
	   System.out.print("* ");   // printing stars
	}     
	System.out.println();   
	}   
  }   
}