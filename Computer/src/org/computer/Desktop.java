package org.computer;

public class Desktop extends Computer {
   public void desktopSize() {
	   System.out.println("512GB");
   }
   
public static void main(String[] args) {
	Computer c1=new Computer();
	c1.computerModel();
	
	Desktop d1= new Desktop();
	d1.desktopSize();
}
}
