package day50_final_super_abstraction;

public class ProgammingLanguage extends Language{
	
	public String name = "Programming Language- Java";
	
	public void printProgammingName() {
		
		System.out.println("Programming L: " +name);
	}
	
	public static void staticMethod() {
		System.out.println("Programming Language - static method"); 

}
}