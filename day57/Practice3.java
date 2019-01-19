package day57;

public class Practice3 {
	
	public static void main(String[] args) {
		System.out.println( "prgram started" );
		try {
			// dangerous action in here
			System.out.println("inside try");
			String a = "abcdfghc"; 
			System.out.println( a.charAt(5)  );
			///System.exit(0);
			
		}catch(NullPointerException  | ArrayIndexOutOfBoundsException |StringIndexOutOfBoundsException e) {
			System.out.println("caught NullPointerException FISH ") ; 
			System.out.println(e.getClass());
		
		}finally {
			System.out.println("program came to finnally block");
		}
			
		
		System.out.println("program ended");
		

	}

}



