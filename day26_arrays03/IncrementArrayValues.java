package day26_arrays03;

public class IncrementArrayValues {
 public static void main(String[]args) {
	 
	int[] nums = {1,2,3,4,5,6,7,8,9};
	
	for(int n : nums) {
		System.out.print(n + " ");
	}
	System.out.println();
	
	/*3.Using a Loop write some code to do the following:
		if the value is even - double it and assign back. 
		If the value is odd - triple it and assign back.
	*/
	
	for(int i = 0; i < nums.length; i++) {
		if(nums[i] % 2 == 0) {
			nums[i] = nums[i] * 2;
		}else {
			nums[i] = nums[i] * 3;
		}
	  //nums[i] = (nums[i] % 2 == 0) ? nums[i] * 2 : nums[i] * 3;
	}
	
	for(int n : nums) {
		System.out.print(n + " ");
	}
	System.out.println();
	
	
	
}
}
