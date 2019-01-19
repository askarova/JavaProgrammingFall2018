package day12_classObject_Strings;

import java.util.Scanner;

public class getBeverage {
public static void main(String[]args) {
	
	//tea->$3
	//coffee->$4
	//water ->$2
	//juice ->$5
	
	Scanner scan= new Scanner(System.in);
	System.out.println("Choose you drink");
	String drink= scan.next();
	double price= 0.0;
	
	switch (drink) {
	case "tea":
		price =3.0;
		break;
	case "coffe":
		price=4.0;
		break;
	case"water":
		price =2.0;
	case"juice":
		price= 5.0;
		break;
		default:
			System.out.println("Invalid drink");
	      return; // go out from whole main method
	}
	System.out.println("Your total is $ " + price);
}
}
