package array;

public class string4 {
    public static void main(String[] args) {
		String s1= "Java";
		String s2= "Java";
		System.out.println(s1.equals(s2));
		
		String s3= "Java";
		String s4= "java";
		System.out.println(s3.equals(s4));
		
		String s5= "Green Technology";
		String s6= "GreenTechnology.";
		System.out.println(s5.equals(s6));
		
		String s7= "Java";
		String s8= "java";
		System.out.println(s7.equalsIgnoreCase(s8));
		
		String s9= "Nisha";
		String s10= "nisHa";
		System.out.println(s9.equalsIgnoreCase(s10));
	}
}
