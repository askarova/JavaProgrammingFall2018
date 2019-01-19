package day55_polymorphism;

public class NewYear extends Holiday{

	int dayOffCount; 
	
	@Override
	public void sendHolidayMessage() {
	
		System.out.println("Happy new year");
		
	}
	
	public void countdown_WelcomeNewBeginning() {
		
		System.out.println("countdown_WelcomeNewBeginning ");
		
	}
	
	
	
}
