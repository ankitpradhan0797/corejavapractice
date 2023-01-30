package org.fibo;

public class fibonacci {
    public static void main(String[] args) {
        int n= 100, first= 0, second= 1;  
        System.out.println("Fibonacci series from 1 to 100 are: ");
    		    
    	while (first<= n) {
    	System.out.print(first + ", ");

    	int nextTerm= first + second;
    	first = second;
    	second = nextTerm;
    	}
    }    		
}
