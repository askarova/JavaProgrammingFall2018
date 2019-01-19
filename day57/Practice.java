package day57;

public class Practice {

	public static void main(String[] args) {
		
		/* Task 1
		 * 	  try to write a code that throw an ArrayIndexOutOfBoundException
		 * 
		 * 	  try to stimulate this process by creating above exception object 
		 * 	  and throwing it back to the program using throw keyword
		 */
		
		String[] str = new String[3] ;
		str[0] = "a" ; 
		str[1] = "b" ; 
		str[2] = "c" ;
		
		String[] str1 = new String[] {"a","b","v"};
		
		String[] str2 = {"a","b","v"};
		
		//System.out.println( str2[10] );
		ArrayIndexOutOfBoundsException npe = new ArrayIndexOutOfBoundsException() ;  
		throw npe ; 
		//throw new ArrayIndexOutOfBoundsException();  
		
		
		
		
		
		// NullPointerException // ArithmaticException // IndexOutOfBoundException 
		//System.out.println("Program started");
//		String s = null ; 
//		System.out.println( s.length()  );
		//System.out.println(  3/0  );
//		int[] nums = {1,2,3} ; 
		//System.out.println( nums[3]  );
		
//		String str = "abc" ; 
//		System.out.println( str.charAt(3) );
		
		//NullPointerException npe1 = new NullPointerException() ;  		
		// throw  keyword 
		//throw npe1 ; 
		
		
		
		//System.out.println(" The program ended");

		
	}
}


		
		
		
	


