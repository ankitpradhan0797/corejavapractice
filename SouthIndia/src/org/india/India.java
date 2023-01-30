package org.india;

import org.andhra.AndhraPradesh;
import org.kerala.Kerala;
import org.tamilnadu.Tamilnadu;

public class India {
   public void india() {
	   System.out.println("South India States");
	   System.out.println("------------------");
   }
   
public static void main(String[] args) {
	India i1=new India();
	i1.india();
	
	Tamilnadu t1= new Tamilnadu();
	t1.tamilLanguage();
	
	Kerala k1=new Kerala();
	k1.malayalam();
	
	AndhraPradesh a1=new AndhraPradesh();
	a1.telugu();
}
}
