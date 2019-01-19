package day8_conditionals2;



public class VotingEligibilityCheck {
   public static void main(String[]args) {
	   
	   //create a variable called age of type int.
	   //check if value of age is 18 or more
	   //true-> you are eligible
	   //false -> you are not yet eligible to vote
	   
	int age = 20;
	
	if(age >= 18) {
		System.out.println("You are eligible to vote");
	}else {
		System.out.println("You are not yet eligible to vote");
	}
	   
   }
}
