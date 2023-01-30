package org.emp;
import org.company.*;
import org.client.*;
import org.project.*;

public class Employee {
   void empName() {
	   System.out.println("Ankit");
   }
   
public static void main(String[] args) {
	Employee e1=new Employee();
	Company c1=new Company();
	Client c2= new Client();
	project p1=new project();
	e1.empName();
	c1.companyName();
	c2.clientName();
	p1.projectName();
}

}
