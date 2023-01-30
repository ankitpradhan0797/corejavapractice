package org.arr;

public class AvgofArray {
   public static void main(String[] args) {
	   int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
       int length = a.length;
       int sum = 0;

       for (int i = 0; i < a.length; i++) {
           sum += a[i];
       }

       double average = sum / length; 
       System.out.println("Average of array : "+average);
   }
}