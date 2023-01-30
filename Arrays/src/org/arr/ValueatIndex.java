package org.arr;
import java.util.ArrayList;

public class ValueatIndex {
	public static void main(String[] args){
		ArrayList<Integer> arr = new ArrayList<Integer>();
			arr.add(10);
			arr.add(20);
			arr.add(30);
			arr.add(40);
			arr.add(50);
			arr.add(60);

			System.out.println("List: " + arr);
			int element = arr.get(5);
			System.out.println("Element at index 2 is "+ element);  
			System.out.println("===============================");
		
		// Get each index value of list by using for loop 
	       int a[] = {105,205,305,405,505,605,705,805};  
	       for(int i =0; i<a.length; i++) {
	     	     System.out.println( "Index of "+a[i] + " = " +i);   
	       }   
	}
}