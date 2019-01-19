package day_13stringManupulation;

public class Login {
 public static void main(String[]args) {
	 
	 String secretUserName= "admin";
	 String secretPassword="abs123";
	 
// create 2 variables, username, password.
//make sure they match with secret ones and allow login sucessfully.
//Whenever login not succesful, let programm tell exact reason
// why it is not valid
	 //username is not valid
	 //password is not valid
	 //both username anf password are invalid
	 String userName= "admin";
	 String password= "abc1234";
	 
if(userName.equalsIgnoreCase(secretUserName)&& password.equals(secretPassword)) {
   System.out.println("Login Successful. Welcome!");

}else {
	//System.out.println("ERROR: Invalid Username or Password");
	if(! userName.equalsIgnoreCase(secretUserName)&& !password.equals(secretPassword)) {	
		System.out.println("ERROR: Both Username and password are invalid");
	}else if(! userName.equalsIgnoreCase(secretUserName)) {
		System.out.println("ERROR: Username is not valid");
	}else {
		System.out.println("ERROR: Password is not valid");
}
}
}
}
