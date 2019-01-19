package day6_operators_boolean;
import java.util.Scanner;

public class WarmUpTasks {
 public static void main(String[]args) {
	 // create a program that accepts value in miles and converts to kilometers
	 
	 Scanner scan = new Scanner(System.in);
	 System.out.println("Enter miles:");
 
     double miles = scan.nextDouble();
     double kms = miles* 1.60934;
     System.out.println("kms value " +kms);
}
}
