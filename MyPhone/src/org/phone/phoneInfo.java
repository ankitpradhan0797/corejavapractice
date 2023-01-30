package org.phone;

public class phoneInfo {
   void phoneName() {
	   System.out.println("Samsung");
   }
   
   void phoneMieiNum() {
	   System.out.println("987654321");
   }
   
   void camera() {
	   System.out.println("48MP");
   }
   
   void storage() {
	   System.out.println("128GB");
   }
   
   void osName() {
	   System.out.println("Android 11");
   }
   
public static void main(String[] args)   {
	phoneInfo p1= new phoneInfo();
	p1.phoneName();
	p1.phoneMieiNum();
	p1.camera();
	p1.storage();
	p1.osName();
}
}
