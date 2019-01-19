package day14_stringManupulation_cont;

public class TrimExamle {
	public static void main(String[]args) {
// trim()- deletes whitespace in the beginning and at the end 
		// including tab and regular space
		//space can be only at the beginning,or only at the end or in both
		//sides.
		//Everything
	
	
		
	    String str = "   blah    ";
		
		System.out.println(str);
// console will print str without the space
//but the value of the str does not change		
		System.out.println(str.trim());
		
		System.out.println(str.length());
// chaining - calling methods one after another		 
		System.out.println(str.trim().length());

	
		
		
	
		
		
		
	}

}
