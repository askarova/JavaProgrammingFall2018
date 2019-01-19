package day10_conditionals4;

public class FizzBuzz {
public static void main(String[]args) {
	
	//for each multiple of 3, print "Fizz" instead of the number.
	//for each multiple of 5, print "Buzz" instead of the number.
	//for numbers which are multiple of both 3 and 5,print "FizzBuzz"
	//instead of the number
	//Else print number itself
	
	int num = 10;
	
	if(num % 3 ==0 && num % 5 ==0) {
		System.out.println("FizzBuzz");
	}else if(num % 3 == 0) {
	System.out.println("Fizz");
	}else if(num %5 == 0) {
		System.out.println("Buzz");
	}else {
		System.out.println(num);
		
	}
}
}
