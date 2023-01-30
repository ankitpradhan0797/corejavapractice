package org.phone;

public class ExternalStorage {
      public void size() {
    	  System.out.println("128GB");
      }
      
public static void main(String[] args) {
	ExternalStorage e1=new ExternalStorage();
	InternalStorage i1=new InternalStorage();
	e1.size();
	i1.processorName();
	i1.ramSize();
}      
}
