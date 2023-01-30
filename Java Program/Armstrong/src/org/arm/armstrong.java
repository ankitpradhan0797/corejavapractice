package org.arm;

import java.util.Scanner;

public class armstrong {
   public static void main(String[] args) {

		int rem, res= 0;
		Scanner s1=new Scanner(System.in);
		System.out.print("Enter the number= " );
		int num = s1.nextInt();
		int temp = num;

		while (temp != 0){
		     rem = temp % 10;
		     res += Math.pow(rem, 3);
		     temp /= 10;
		}
		s1.close();
		if(res == num)
		    System.out.println(num + " is an Armstrong number.");
		else
		    System.out.println(num + " isn't an Armstrong number.");
	}
}

// 3digits Armstrong Number--> 153,370,371,407
// 4digits Armstrong Number--> 1634,8208