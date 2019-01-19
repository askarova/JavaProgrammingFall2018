package homeWorks;

import java.util.Scanner;

public class Alphabet {
   public static void main(String[]args) {
	   
	   String inputLetter = "";   
	 
	System.out.print("Please enter a letter from English alphabet: ");
	   
	   Scanner scan =new Scanner(System.in);
	   inputLetter = scan.next();
	    
	   if (inputLetter.equals("a") || inputLetter.equals("e") || inputLetter.equals("i") || inputLetter.equals("o") || 
			   inputLetter.equals("u")){
	System.out.println(inputLetter + " is a VOWEL.");
	

	   }else{
			 System.out.println(inputLetter + " is a CONSONANT.");	 
	
	   

	   }      
   }
}

	   
	   
	   
	    
	
   


