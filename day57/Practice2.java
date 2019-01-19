package day57;

public class Practice2 {

	public static void main(String[] args) {
		
		/*
		 * 
		 *  TASK 2 
		 *	try to create a code that might 
		 *  throw ArrayOutOfBoundException
		 *  and try to end your program gracefully
		 *  without seeing error codes in consule
		 *  
		 *  try to fix the code to make sure
		 *  it does not throw an exception 
		 *  and run the program again and see
		 *  what you get, 
		 *
		 */

		
//		try {
//            String[] str = { "One", "Two", "Three" };
//            System.out.println(str[]);
//        } catch (ArrayIndexOutOfBoundException e) {
//            System.out.println("Wrong index");
//        }
//        System.out.println("After array");
//		
		System.out.println( "prgram started" );
		try {
			// dangerous action in here
			System.out.println("inside try");
			String a = null; 
			System.out.println( a.length()  );
			
		}catch(NullPointerException e) {
			System.out.println("caught NullPointerException FISH ") ; 	
		
		}catch(ArrayIndexOutOfBoundsException e) {			
			//NullPointerException e = new NullPointerException(); 			
			System.out.println("caught ArrayIndexOutOfBoundsException FISH ") ; 	
			//e.printStackTrace();
		}
			
		
		System.out.println("program ended");
		//throw new NullPointerException();
		//return ; 
		

	}

}
