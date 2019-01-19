package day12_classObject_Strings;

public class StringClass {
  public static void main(String[]args) {
	  
	  
	  String name="Asiiat";
	  
	  //declaring a variable-> String name
	  
	  System.out.println(name.toUpperCase());
	  System.out.println(name.toLowerCase());	
	  System.out.println(name);
	  
	  name=name.toUpperCase();
	  System.out.println(name);
	  
	  System.out.println(name.length());
	  System.out.println("java".length());
	  
	  int count= name.length();
	  System.out.println("Count is" + count);
	  
	  System.out.println(name.charAt(0));
	  
	  if(name.charAt(0)=='A') {
		  System.out.println("A is first letter");
	  }else {
		  System.out.println("A is not fist letter");
		  
	  }
	 char secondChar= name.charAt(1);
	 System.out.println(secondChar);
	 
	
	  
	  
	  
  }
}
