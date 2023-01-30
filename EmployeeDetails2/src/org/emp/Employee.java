package org.emp;

public class Employee {
	
	// By Changing the Number of Parameters
   void empId(int a,int b) {
	   System.out.println(a+b);
   }
   
   void empId(int a,int b,int c) {
	   System.out.println(a+b+c);
   }
   
// By Changing the Data Types of Parameters
   void empId1(int x, int y) {
	   System.out.println(x+y);
   }
   
   void empId1(double x, double y, double z) {
	   System.out.println(x+y+z);
   }
   
// By Changing the Orders of Parameters
   void empId2(String name, int id) {
	   System.out.println("empName :" + name + " " + "Id :" + id);
   }
   
   void empId2(int id, String name) {
	   System.out.println("Id :" + id + " " + "empName :" + name);
   }
   
public static void main(String[] args) {
	Employee e=new Employee();
	e.empId(10, 20);
	e.empId(15, 25, 35);
	
	Employee e1=new Employee();
	e1.empId1(11, 22);
	e1.empId1(5.5, 7.3, 3.1);

	Employee e2=new Employee();
	e2.empId2("Ankit", 101);
	e2.empId2(102, "Amrit");
 }
}
