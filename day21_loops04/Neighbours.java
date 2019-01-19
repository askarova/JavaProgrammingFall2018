package day21_loops04;

public class Neighbours {
	public static void main(String[] args) {
		/*
		 * String word and you need to check for same character side by side
		 * if found say "beep -" character
		 * ex:
		 * 	abccddefg
		 *  cc Beep - c
		 *  dd Beep - d
		 */
		String word = "javvva";
		             //012345
		for(int n = 0; n < word.length()-1; n++) {
			if(word.charAt(n) == word.charAt(n+1)) {
				System.out.println("Beep - " + word.charAt(n));
			}
		}
		             
		for(int n = 0; n < word.length()-1; n++) {
			if(word.substring(n, n+1).equals(word.substring(n+1,n+2)) ) {
				System.out.println("Beep - " + word.substring(n, n+1) );
			}
		}
		
		
		//System.out.println("Beep - !!!");
		
	}
}
  
