package day53_warmUp;

public class RegularUser extends SlackUser {
	
	//int age; these are coming from parent class
	//String name;
	int groupNumber;
	
	public RegularUser(int age, String name,int groupNumber) {
		//super();
		super(age, name);
		this.groupNumber = groupNumber;
		
	}
	@Override
	public void sendMessage(String message) {
		System.out.println("message "+message);
		
	}
	public void joinGroup(int groupNumber) {
		System.out.println("Regular user joinAGroup "+groupNumber);
		this.groupNumber = groupNumber;
	}
	

	

}