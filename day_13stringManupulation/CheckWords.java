package day_13stringManupulation;

import java.util.Scanner;

public class CheckWords {
   public static void main(String[]args) {
	   
	   Scanner scan=new Scanner(System.in);
	   System.out.println("Enter 3 words");
	   String word1=scan.next();
	   String word2=scan.next();
	   String word3=scan.next();
	   
	   if(word1.length()==word2.length()&word2.length()==word3.length()){
		   System.out.println("All words are same length");
	   
	   }else if(word1.length()==word2.length()|| 
			   word1.length()==word3.length()||
			   word2.length()==word3.length()) {
		  System.out.println("Not Same nor Different lenght");
		  
	   }else {
		   System.out.println("All are different lenght");
		  
		  
	   }
	   
			   
   }
}
