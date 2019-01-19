package day8_conditionals2;

import java.util.Scanner;

public class ChooseALanguage {
   public static void main(String[]args) {
	   //English ->1
	   //Spanish ->2
	   //Turkish ->3
	   //Russian ->4
	   //Uygur-> 5
	   //Uzbek -> 6
	   //Kyrgyz ->7
	  
	   System.out.println("Please select: 1 for English ->1\n"+
	                      "Spanish -> 2 \n"+
			               "Turkish ->3 \n" +
	                       "Russian ->4 \n" +
	                       "Uygur ->5 \n"+
	                       "Uzbek ->6 \n"+
	                       "Kyrgyz ->7 \n" +
	                       "Tajik -> 8");
			   
	   Scanner scan =new Scanner(System.in);
	   int language=scan.nextInt();
	   
	
	String greeting="";
	
	
	if(language ==1) {
		greeting ="Hello,how are you?";
	}else if(language ==2) {
		greeting = "Hola, Como Estas?";
	}else if(language==3) {
		greeting = "Merhaba,Nasilsiniz?";
	}else if(language==4) {
		greeting="Privet,Kak Dela?";
	}else if(language==5) {
		greeting= "Salam?";
	}else if(language==6) {
		greeting= "Salom,Qalesiz?";
	}else if(language==7) {
		greeting = "Salam, Kandaysiz?";
	}else if(language==8) {
		greeting ="Salom, Chihel shumo?";
	}else {
		System.out.println("I do not speak that language");
	
		System.out.println("Invalid input! Please enter month number between 1-12");
	}
	System.out.println(greeting);
	
	
			   
   }
   
			   
   }

