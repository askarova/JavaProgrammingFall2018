package day15_stringManupulation_review;

import java.util.Scanner;

public class duplicateIt {

// ask user  to enter two words. 
//print first word, second word, second word, first word.
// Input: one 
//	      two
	
//Output: onetwoone
	
		
	public static void main (String[]args) {
		Scanner scanner = new Scanner(System.in);
		
	System.out.println("Please enter a word");
	String one = scanner.nextLine();
	System.out.println("Please enter another word");
	String two =scanner.nextLine();
	System.out.println(one + two + two + one);

	
		scanner.close();
		
	}
	
	
	
}
