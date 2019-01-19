package day57;

import java.io.File;
import java.io.FileNotFoundException;

public class CheckedException {

	// Unchecked Exception 
		// we do not have to handle at compile time
		// Anything that IS-A RunTimeException can be called as 
					// unchecked exception 
	
	// Checked Exception 
		// we have to handle at compile time or it will not compile
		// Anything that IS-A  Exception 
		//  BUT NOT IS-A RUNTIME EXCEPTION 
	
	
	
	public static void main(String[] args) {
		
		//FileNotFoundException -- checked exception 
		System.out.println( "ABC" );
		NullPointerException e = new NullPointerException();
		//FileNotFoundException e = new FileNotFoundException();
		try {
			System.out.println("doing dangerous action'");
			throw e ;
		} catch (RuntimeException e1) {
			// TODO Auto-generated catch block
			System.out.println("handled the exception");
		} 
		

	}

}


