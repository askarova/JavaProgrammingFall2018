package replIt;

import java.util.Arrays;

public class MethodsWithArraysSwitchElements {
	public static void main(String[]args) {
		
	int[] nums = {1,2,3,4};
	System.out.println("Original Array: "+ Arrays.toString(nums)); 
	int x = nums[0];
	nums[0] = nums[nums.length-1];
	nums[nums.length-1] = x;
System.out.println("New array after swaping the first and last elements: "
	+Arrays.toString(nums));  
	 }
	
	
	}
	
	

	


