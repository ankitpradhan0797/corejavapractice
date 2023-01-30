package array;
import java.util.Scanner;

public class string5a {
    public static void main(String[] args) {
    	
		Scanner s1= new Scanner(System.in);
		System.out.println("Enter the email= ");
		String str=s1.nextLine();
		
		if(str.indexOf("@")>0)
			System.out.println("Valid email Id");
		else 
			System.out.print("Invalid email Id");
		s1.close();
	}
}
