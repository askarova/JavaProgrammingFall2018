package day21_loops04;

public class FindHowManyTimes {
	public static void main(String[] args) {
		/*1. Accept a string and if it is palindrome, print "Palindrome", 
		if not print "Not Palindrome"
		Step 1 - reverse the string: java -> avaj
		Step 2 - compare reversed version with original
		
		abba
		abba - same
		racecar
		racecar - same
		*/             
		String word = "Level";
		String reversed = "";
		         
		for(int idx = word.length()-1; idx >= 0; idx-- ) {
			//System.out.print(word.charAt(idx));
			reversed += word.charAt(idx);		
		}
		
		System.out.println(reversed);
		//System.out.println(word);
		if(word.equalsIgnoreCase(reversed)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}


	}
}
