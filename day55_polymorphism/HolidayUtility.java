package day55_polymorphism;

public class HolidayUtility {

	
	public static void main(String[] args) {
	
		// call below by passing all the argument you can pass
	
//		sendMessage(new Christmas());
//		sendMessage(new NewYear());
//		sendMessage(new Holiday());
		
		Holiday h1 = new Holiday();
		sendMessage(h1);
		
		Holiday h2 = new Christmas();
		sendMessage(h2);
	
		Holiday h3 = new NewYear();
		sendMessage(h3);
		
		
		System.out.println(h1);
	}
	
	static void sendMessage(Holiday h) {
		System.out.println("sending message from utility");
		h.sendHolidayMessage();
	}
	
	// christmans class
	static void sendMessage(GiftReceiver h) {
		System.out.println("sending GiftReceiver message from utility");
		
	}
}