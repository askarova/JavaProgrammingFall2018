package day8_conditionals2;
import java.util.Scanner;

public class WarmUpTasks {
   public static void main(String[]args) {
	   //write a program that asks a student what is their Batch number.
	   //if that is 10, say - we are  classmates!
	   //if not,say something else.
	   
Scanner scan = new Scanner(System.in);
System.out.println("Please enter your Batch numebr");
int batch =scan.nextInt();

if(batch ==10) {
System.out.println("We are classmates!");	
}else {
	System.out.println("Nice to meet anyways");
}




   }
   
   
   
}
