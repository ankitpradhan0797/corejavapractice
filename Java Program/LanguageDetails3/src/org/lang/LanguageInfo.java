package org.lang;

public class LanguageInfo extends StateDetails {
   public void tamilLanguage() {
	   System.out.println("Here people Speaks tamil Language");
   }
   
   public void englishLanguage() {
	   System.out.println("English Language Speaked By Foreign People");
   }
   
   public void hindiLanguage() {
	   System.out.println("Here people speaks hindi language");
   }
   
public static void main(String[] args) {
	
	StateDetails s1=new StateDetails();
	LanguageInfo l1=new LanguageInfo();
	
	s1.southIndia();
	l1.tamilLanguage();
	
	s1.northIndia();
	l1.hindiLanguage();
	
	l1.englishLanguage();
	
 }   
}
