package day43_static;

public class TVRunner {
	public static void main(String[] args) {
		TV myTV = new TV();       //INSTANTIATION of TV class
		TV smartTV = new TV("Sharp");//Instantiating TV class
		TV cTV = new TV("HP");
		
		System.out.println(myTV.isOn());
		System.out.println(smartTV.isOn());
		System.out.println(cTV.isOn());
		
		myTV.turnOn();
		smartTV.turnOn();
		cTV.turnOn();
		
		System.out.println(myTV.isOn());
		System.out.println(smartTV.isOn());
		System.out.println(cTV.isOn());
		
		myTV.turnOn();
		
		myTV.setChannel(200);
		smartTV.setChannel(55);
		
		System.out.println("My TV:" + myTV.getChannel());
		System.out.println("smartTV :" + smartTV.getChannel());
		System.out.println("cTV:" + cTV.getChannel());
		
		myTV.channelUp();
		smartTV.channelDown();
		
		System.out.println("My TV:" + myTV.getChannel());
		System.out.println("smartTV :" + smartTV.getChannel());
		
		cTV.turnOff();
		cTV.setChannel(22);
	}
}