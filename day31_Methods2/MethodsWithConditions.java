package day31_Methods2;

import java.util.Arrays;

public class MethodsWithConditions {
public static void main(String[]args) {	
	getLarger(100,40);
	
	int []arr = {100,3000,40};
	getMax(arr);
	
	getMax(new int[] {300,3500,5000});
	//public static void getMax(int[]nums)	
	
}
	
	
//create a method getLarger that accepts 2 numbers and prints larger one
//if they are equal it prints"Numbers are equal: number"
	
	public static void getLarger(int num1, int num2) {
		if(num1>num2) {
			System.out.println(num2);
		}else {
			System.out.println("Numbers are equal: " + num1);
		}
	}

	//creare a method getMax that accepts an int array and prints largesr number in array
	// if array is empty, print "Error:Array is empty"
	
	
	public static void getMax(int[]nums) {
		//if array is empty, print "Error:Array is empty
		if(nums.length==0) {
			System.out.print("ERROR: Array is empty");
			return;
		}
Arrays.sort(nums);
System.out.println(nums[nums.length -1]);
		
		
		
	}
	
	
	
	
	
	
}
