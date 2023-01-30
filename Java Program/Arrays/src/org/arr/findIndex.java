package org.arr;
import java.util.ArrayList;

public class findIndex {
   public static void main(String[] args) {	   
	  // Find the index of 10
	  ArrayList<Integer> arr = new ArrayList<Integer>();
	      arr.add(10);
	      arr.add(20);
	      arr.add(30);
	      arr.add(90); 
	      int position =arr.indexOf(10);
	      System.out.println(position);  
	      System.out.println("------");
	  
	  // Find the last index of 10
	  ArrayList<Integer> arr1 = new ArrayList<Integer>(10);
	      arr1.add(10);
		  arr1.add(20);
		  arr1.add(30);
		  arr1.add(90); 
		  arr1.add(10);  
		  arr1.add(10);  
		  arr1.add(40);  
		  arr1.add(50);  
		  int position1 =arr1.lastIndexOf(10);
		  System.out.println(position1); 
		  System.out.println("------");
	   
	   // Find the index value of 50 & 90
	   ArrayList<Integer> arr2 = new ArrayList<Integer>(10);
	      arr2.add(10);
		  arr2.add(20);
		  arr2.add(30);
		  arr2.add(90); 
		  arr2.add(10);  
		  arr2.add(10);  
		  arr2.add(40);  
		  arr2.add(50);  
		  int position2 =arr2.indexOf(50);
		  int position3 =arr2.indexOf(90);
		  System.out.println(position2);   
		  System.out.println(position3); 
		  System.out.println("---------------");
	   
	   // Find each index value of 10 present in below list
	   int a[] = {10, 20, 30, 90, 10, 40, 50, 10}; 
       for(int i =0; i<a.length; i++) { 
    	  if(a[i] == 10) 
    	     System.out.println( "Index of "+a[i] + " = " +i);   
      }   
   }
}
       
   	    
