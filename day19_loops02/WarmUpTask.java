package day19_loops02;

public class WarmUpTask {
	public static void main(String[]args) {
		
//Write a program that takes string word and converts
//first letter to uppercase and the rest to lowercase. 
//Print it after conversion
		
	String word = "jAVA";
//substring to take first letter of the word
	System.out.println(word.substring(0,1).toUpperCase());
	System.out.println(word.substring(1).toLowerCase());	
	
	word=word.substring(0,1).toUpperCase() + word.substring(1).toLowerCase();
	System.out.println(word);
	
		}
	
	
	
}

	



