package day50_final_super_abstraction;

public class FinalMethods {
	
	public void makeAPhoneCall(String phoneNumber) {
		System.out.println("Dial number : " + phoneNumber + "\n Press On Call");
	}

}
class Sub extends FinalMethods{
	public void makeAPhoneCall(String phoneNumber) {
		
	}
}