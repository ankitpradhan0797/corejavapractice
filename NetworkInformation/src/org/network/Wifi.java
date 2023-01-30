package org.network;

public class Wifi {
    public void wifiName() {
    	System.out.println("Tekizma 5G");
    }
    
public static void main(String[] args) {
	Wifi w1=new Wifi();
	w1.wifiName();
	
	MobileData m1=new MobileData();
	m1.dataName();
	
	Lan l1=new Lan();
	l1.lanName();
	
	Wireless w2=new Wireless();
	w2.modemName();
}    
}
