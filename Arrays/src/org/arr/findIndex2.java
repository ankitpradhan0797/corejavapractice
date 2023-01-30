package org.arr;
import java.util.ArrayList;

public class findIndex2 {
    public static void main(String[] args) {
        //ArrayList<Integer> aList = new ArrayList<Integer>();
        // Get the index value of 10
/*      aList.add(10);
    	aList.add(20);
    	aList.add(30);
    	aList.add(40);
    	aList.add(50);
    	System.out.println(aList.indexOf(10));   */
       
        // Get the index value of last 10
/*       aList.add(10); 
       aList.add(20); 
       aList.add(30); 
       aList.add(40); 
       aList.add(10); 
       aList.add(50); 
       aList.add(10); 
       System.out.println(aList.lastIndexOf(10));   */
        
       // Get each index value of 10 present in below list 
       int a[] = {10, 20, 30, 90, 10, 10, 40, 50, 10};  
       for(int i =0; i<a.length; i++) {
     	  if(a[i] == 10) 
     	     System.out.println( "Index of "+a[i] + " = " +i);   
       }   
    }
}