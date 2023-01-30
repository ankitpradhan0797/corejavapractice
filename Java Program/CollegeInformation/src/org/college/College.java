package org.college;

public class College {
    public void collegeName() {
    	System.out.println("BCET");
    }
    
    public void collegeCode() {
    	System.out.println("CA1205153");
    }
    
    public void collegeRank() {
    	System.out.println("12");
    }
    
public static void main(String[] args) {
	College c1=new College();
	c1.collegeName();
	c1.collegeCode();
	c1.collegeRank();
	
	Hostel h1=new Hostel();
	h1.hostelName();
	
	Student s1=new Student();
	s1.studentName();
	s1.studentDept();
	s1.studentId();
	
	Dept d1=new Dept();
	d1.deptName();
}
}
