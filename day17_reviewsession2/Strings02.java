package day17_reviewsession2;

import java.util.Scanner;

public class Strings02 {
	public static void main(String[]args) {
//create 1 string variable
//if first and last chars are same print"firsts same"
//if second and second from the last are same -print "second same"
//scanner with next() method
	
		Scanner input = new Scanner(System.in);
		System.out.println("What is the word?");
		String word = input.next();
// test below conditions only if word has at leats 4 chars
// if less than 4 chars -> say Error: at least 4 chars required for this
		//program
		
		if(word.length()>=4) {
			
		
		if (word.charAt(0)== word.charAt(word.length()-1)) {
			System.out.println("First Same");
		}
		//check second and second from end	
		if(word.charAt(1)== word.charAt(word.length()-2)) {
		System.out.println("Second Same");
		
		
		}
		}else {
			
		}
		System.out.println("Error: at leats 4 chars required for this program");
		
		
		
	}

}
