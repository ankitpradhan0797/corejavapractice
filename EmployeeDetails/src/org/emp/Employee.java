package org.emp;

public class Employee {
    void empId() {
    	System.out.println("101");
    }
    
    void empName() {
    	System.out.println("Ankit");
    }
    
    void empDob() {
    	System.out.println("21/01/1997");
    }
    
    void empPhone() {
    	System.out.println("9348424941");
    }
    
    void empMail() {
    	System.out.println("ankit.pradhan@tekizma.com");
    }
    
    void empAddress() {
    	System.out.println("Bangalore");
    }
    
public static void main(String[] args) {
	Employee e1=new Employee();
	e1.empId();
	e1.empName();
	e1.empDob();
	e1.empPhone();
	e1.empMail();
	e1.empAddress();
}
}
