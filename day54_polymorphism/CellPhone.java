package day54_polymorphism;

public class CellPhone extends Phone{
	
	int buttonCount= 20;
	boolean isTouchScreen;
	
	@Override
	
	public void makeCall() {
		System.out.println("Call By Cellphone" + buttonCount);
	}
	public static void main(String[]args) {
		
		Phone p1= new CellPhone();
		p1.makeCall();
		System.out.println(p1.buttonCount);
		
	}
	
	public void callWithoutCable() {
		System.out.println("A method that cellPhoneOnly");
		
	}

}
