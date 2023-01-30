package org.sum;

public class sumOfOdd {
   public static void main(String[] args) {
	 int sum=0;
	 for(int i=0; i<=100; i++) {
		if(i%2 != 0) {
			sum+=i;
		}
	}
	System.out.println("Sum of odd numbers from 1-100: "+sum);
   }
}
