package day55_polymorphism;

public class Christmas extends Holiday implements GiftReceiver{
	
	int giftCount ; 
	
	@Override
	public void sendHolidayMessage() {
		//super.sendHolidayMessage();
		System.out.println(" Merry Chirstmas" );
	
	}
	
	
	public void exchangeGift() {
		
		System.out.println("exchange Gift" );
	
	}


	@Override
	public void receiveGift() {
		System.out.println("receive gift in Christmas");
	}
	

	

}
