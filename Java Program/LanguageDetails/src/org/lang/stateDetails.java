package org.lang;

public class stateDetails {
	public void southIndia() {
		System.out.println("Tamilnadu");
	}
	
	public void northIndia() {
		System.out.println("Himachalpradesh");
	}
	
    public static void main(String[] args) {
		
		LanguageInfo l1 = new LanguageInfo();
		stateDetails s1 = new stateDetails();
		
		s1.southIndia();
		l1.tamilLanguage();
		System.out.println("======================");
		
		System.out.println("International language");
		l1.englishLanguage();
		
		System.out.println("========================");
		s1.northIndia();
		l1.hindiLanguage();
		
	}
}
