package day20_loops03;

import java.util.Scanner;

public class PrintCharsWhileLoop {
 public static void main(String[]args) {
	 // write a program that accepts a String word
	 //and using while loop and charAT print each char in separate line
	 
	 Scanner scan = new Scanner(System.in);
	 System.out.println("Enter word");
	 String word = scan.next();
	 
	 
	 int index = 0;
	 while(index < word.length()) {
		 System.out.println(word.charAt(index));
		 index++;
		 
		
	 }
 }
}
