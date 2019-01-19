package day40_customclasses;

public class Dog {
	/*
	 * Dog class/template:
	    Properties/Data/Information
	        -breed
	        -color
	        -size-> int
	        
	    Behaviour:
	        -bark
	        -eat
	        -run
	
*/

	String breed;
	String color;
	int size;
	
	public void bark() {
		System.out.println("Dog is barking Whoof Whoof" );
		
	}
	public void eat() {
		System.out.println("Dog is eating");
		
	}
	public void run() {
		System.out.println("Dod is running");
		
	}
	
	
}
