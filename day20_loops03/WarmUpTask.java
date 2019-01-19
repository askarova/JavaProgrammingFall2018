package day20_loops03;
import java.util.Scanner;
public class WarmUpTask {
public static void main(String[]args) {
// Ask user to enter 2 numbers for variables start and end:
// if start is less than end: loop from start position to end position
// and print "Step " + number.
// If start is more than end: loop backwards from end to start
// and print "Step "+ number
	
	Scanner input = new Scanner(System.in);
	System.out.println("Enter 2 numbers:");
	int start = input.nextInt();
	int end = input.nextInt();
	   
	if(start < end) {
		System.out.println("LOOPING FORWARD");
		while(start <= end) {
			System.out.println("Step " + start);
			start++;
		}     
	}else if(start > end){
		System.out.println("LOOPING BACKWARDS");
		while(start >= end) {
			System.out.println("Step " + start);
			start--;
		}
	}else {
		System.out.println("START AND END ARE EQUAL");
		System.out.println("Step " + start);
	}
	
}
}
		
	
	




