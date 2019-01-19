package day30_methods01;

import day31_Methods2.Calculator;

public class MethodsIntro {
  public static void main(String[]args) {
	  sayHello();//calling sayHello method
	  askHowRU();
	  sayHello("Sergey");
	  reply();
	  System.out.println("I am doing great! Thanks");
	  sayBye();
	  sayBye();
	  nice();
	  
	  Calculator.add(25, 25);
	  Calculator.multiply(2, 2);
	  Calculator.divide(50, 10);
  }
  
  
  public static void sayHello() {
	  System.out.println("Hello");
  }
	  
	  public static void sayHello(String name) {
		  
		  System.out.println("Hello" + name);
	  }
  
  
  //write a method askHowRU, "how are you doing?"
  
  public static void askHowRU() {
	  System.out.println("How are you?");
  }
  
  
  //write a method reply, that prints I am doing well, how about you?
  
  public static void reply() {
	  System.out.println("I am doing well, how about you?");
  }
  
  
  //wtire a method sayBye, that says "bye have a nice day.
  public static void sayBye() {
	  System.out.println("Bye! Have a nice day");
  }
  
  public static void nice() {
	  System.out.println("Have a nice day");
  }
  
}


