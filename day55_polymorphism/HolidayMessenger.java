package day55_polymorphism;

public class HolidayMessenger {

	public static void main(String[] args) {
	
		Holiday h1 = new Christmas(); 
		h1.sendHolidayMessage();
		// print h1.name 
		// print h1.giftCount 
		// 
		
		Christmas c1 = (Christmas) h1 ;
		System.out.println(  c1.giftCount );
		
		//System.out.println(    ( (Christmas) h1 ).giftCount       );
		
		
		
		
		h1 = new NewYear() ; 
		h1.sendHolidayMessage();
		
		
		NewYear n1 = (NewYear) h1 ; 
		n1.countdown_WelcomeNewBeginning();
		
//		long i = 10 ; 
//		int j = (int)i ; 
		
		
		
		
		// ONLY REFERENCE TYPE DECIDE WHAT YOU CAN ACCESS AT COMPILE TIME
		
		
		
		
	}

}
