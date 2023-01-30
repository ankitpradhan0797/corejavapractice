package org.arr;

public class SumofArray {
    public static void main(String[] args) {
    	 int a[]= {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
         int sum = 0;  
 
         for (int i = 0; i < a.length; i++) {  
            sum = sum + a[i];  
         }  
         System.out.println("Sum of all the elements of an array: " + sum);  
    }  
}