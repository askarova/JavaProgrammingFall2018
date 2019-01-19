package day17_reviewsession2;

import java.util.Scanner;

public class Strings03 {
 public static void main(String []args) {
	 //take a String countryName and abbreviate it by taking first 2 letters
	 //country name is -> Bangladesh ->BA, toUppercase()
	 
	 Scanner input = new Scanner(System.in);
	 System.out.println("Enter country name");
	 String countryName = input.nextLine();
	 
	 String abbreviated = countryName.substring(0,2).toUpperCase();
	 //Abbreviated = abbreviated.toUpperCase();
	 System.out.println(abbreviated);
	 
	 //ternary condition using ? :
	 //check if abbreviated is 2 chars:
	 //if true -> say "2 chars detected"
	 //else say "2 chars were not found"
	 
	System.out.println(abbreviated.length()==2 ? "2 chars detected": "2 chars were not detected");
	
	String msg1 = "2 chars detected";
	String msg2 = "2 chars were not found";
	String result = abbreviated.length()== 2? msg1: msg2;
	System.out.println(result);
	
	
	//Convert this to Ternary:
	//if 2 chars 
	//if first char is U say "maybe USA"
	//}else { say "Not USA for sure"
    //}else { say 2 chars were not found
		
	result = abbreviated.length()==2 ? 
		     abbreviated.charAt(0)== 'U'? "Maybe USA": "Not USA":"2 chars were not found";
		
	System.out.println(result);
		
	
	
		
	 
 }
}
