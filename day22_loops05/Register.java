package day22_loops05;

import java.util.Scanner;

public class Register {
  public static void main(String[]args) {
	  
	  Scanner scan= new Scanner(System.in);
	  System.out.println("Welcome to our store :)");
	 
	  System.out.println("How many items you have?");
	  int itemsCount=scan.nextInt();
	  
	  String allItems="";
	  double totalPrice=0;
	for(int i=1; i<=itemsCount;i++);
	  
	 System.out.println("What is item?");
	 String item=scan.next();
	 
	 System.out.println("How much is "+ item +"?");
	 double price =scan.nextDouble();
	 
	 allItems= allItems +item +",";
	 totalPrice= totalPrice+price;
	 
	 System.out.println("Your items:"+allItems);
	 System.out.println("Total price: "+ totalPrice);
  }
}
