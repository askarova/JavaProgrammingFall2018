package day59_exceptions;

public class TryCatchFinally {
	
public static void main(String[] args) {
		
		// Multi try catch block order 
		/*
		 * The more specific type (sub class type) should be used first in catch block
		 * and the more general type(super class type) should be used after. 
		 * 
		 * If you use | to chain multiple exception in one catch block 
		 * THEY SHOULD NOT HAVE PARENT CHILD RELATIONSHIP
		 * */
		
		
		try {
			Thread.sleep(1000);
			System.out.println("abc".charAt(10)); //-->>strIndexoutOfBoundexec		
//		} catch (InterruptedException e) {
//			System.out.println("InterruptedException");
//		} catch (Exception e) {
//			System.out.println(" any other type of exception");
		}catch(InterruptedException | StringIndexOutOfBoundsException e) {
			System.out.println("2 exception i will catch");
		}

		System.out.println("abc");
		

	}

}


