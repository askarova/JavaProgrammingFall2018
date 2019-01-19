package day59_exceptions;

public class MethodException {
	
public static void main(String[] args){
		
		// throw -->> used to actually throw and exception to the program
		// throws -->> only used in method header and it's used to declare
						// document by calling this method you need to handle
						// the exception type that might happen
//		playWithFire();
		//waitFewSeconds(5);
		
		try {
			playWithFire();
		} catch (Exception e) {
			System.out.println("handling playing with fire");
		}
//		
//		
//		playDangerousStuff() ;
	
		
		

	}
	
	public static void playWithFire() throws Exception {
		
		System.out.println("dangerous fire stuff");
		throw new Exception();
		// there is a code might throw an exception
		
	}
	
	public static void playDangerousStuff() throws Exception {
		
		playWithFire();
		
	}
	
	
	public static void waitFewSeconds(int second) throws InterruptedException {
		
		System.out.println("wait started");
		Thread.sleep(second * 1000);
		System.out.println("wait ended");
		
	}

}