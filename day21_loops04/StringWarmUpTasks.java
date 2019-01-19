package day21_loops04;

import java.util.Scanner;

public class StringWarmUpTasks {
 public static void main(String[]args) {

//Accept a string and if its palindrome,print "Palindrome"
//if not not "palindrome"
	 
	String word ="java";
	String reversed ="";
	
for(int idx = word.length()-1; idx >=0; idx--) {
	//System.out.print(word.charAt(idx));
	reversed += word.charAt(idx);
}
System.out.println(reversed);	
System.out.println(word);
if(word.equals(reversed)) {
	System.out.println("Palindrome");
}else {
	System.out.println("Not Palindrome");
	
	
}
	}
	 
	 
 }

