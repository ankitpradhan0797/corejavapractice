package org.allvehicle;

import org.fourwheeler.FourWheeler;
import org.threewheeler.ThreeWheeler;
import org.twowheeler.TwoWheeler;

public class Vehicle {
    public void vehicleNecessary() {
    	System.out.println("All vehicle Goods");
    }
    
public static void main(String[] args) {
	Vehicle v1=new Vehicle();
	v1.vehicleNecessary();
	
	TwoWheeler t1=new TwoWheeler();
	t1.bike();
	t1.cycle();
	
	ThreeWheeler t2=new ThreeWheeler();
	t2.auto();
	
	FourWheeler f1=new FourWheeler();
	f1.car();
	f1.bus();
	f1.lorry();
}    
}
