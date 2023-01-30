package org.all;

import org.eng.English;
import org.tamil.Tamil;
import org.telugu.Telugu;

public class languageClass extends Tamil{
	public void alllanguage() {
		System.out.println("The all languages are mentioned below");
		System.out.println("-------------------------------------");
	}
	
public static void main(String[] args) {
		
		languageClass l1 = new languageClass();
		Tamil t1 = new Tamil();
		Telugu t2 = new Telugu();
		English t3 = new English();
		
		l1.alllanguage();
		t1.tamillanguage();
		t2.telugulanguage();
		t3.englishlanguage();
	}
}
