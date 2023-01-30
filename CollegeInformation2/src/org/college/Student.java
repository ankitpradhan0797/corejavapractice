package org.college;

public class Student extends College {
   public void studentName() {
	   System.out.println("Ankit Ku Pradhan");
   }
   
   public void studentDept() {
	   System.out.println("Mechanical");
   }

   public void studentId() {
	   System.out.println("1501225153");
   }
   
public static void main(String[] args) {
	College c1= new College();
	c1.collegeName();
	c1.collegeCode();
	c1.collegeRank();
	
	Student s1= new Student();
    s1.studentName();
    s1.studentDept();
    s1.studentId();
    
    Hostel h1= new Hostel();
    h1.hostelName();
    
    Dept d1= new Dept();
    d1.deptName();
}
}
