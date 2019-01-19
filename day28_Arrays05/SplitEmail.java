package day28_Arrays05;

public class SplitEmail {
 public static void main(String[]args) {
	 
	 //Given a String variable email, write code using split method
	 //to print email id and domain in separate lines.

	 //Example:
	 //email -> info@cybertekschool.com
	 //Print:  
	 //Email id: info
	 //Email domain: cybertekschool.com
	 
		/*
	    Given a String variable email, write code using split 
	    method to print email id and domain in separate lines.
		Example:
		email -> info@cybertekschool.com
		Print:  
		Email id: info
		Email domain: cybertekschool.com
	 */
	
	String email = "info@cybertekschool.com";
	
	String[] splitted = email.split("@");
	
	System.out.println(splitted.length);
	
	if(splitted.length == 2) {
		System.out.println("Email id: " + splitted[0]);
		System.out.println("Email domain: " + splitted[1]);
	}else {
		System.out.println("invalid email");
	}
	
}
}