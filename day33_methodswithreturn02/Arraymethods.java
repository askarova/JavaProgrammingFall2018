package day33_methodswithreturn02;
  
import java.util.Arrays;
import java.util.Random;

public class Arraymethods {
	
	/*
	 * Method: getIntArray5
	 * Params/Args: nothing
	 * Return: int array
	 * 
	 * Creates an array with 5 ints and assigns random numbers,
	 * between 0 - 100 then returns that array
	 * 
	 * getIntArray5() -> [43, 23, 54, 1, 89]
	 * 
	 */
	
	public static void main(String[] args) {
	/*	int[] nums = new int[5];
		Random rdm = new Random();
		
		for(int i=0; i<nums.length; i++) {
			nums[i] = rdm.nextInt(101);
		}
		
		System.out.println(Arrays.toString(nums));
		
		int[] nums2 = {rdm.nextInt(101),
					   rdm.nextInt(101),
					   rdm.nextInt(101),
					   rdm.nextInt(101),
					   rdm.nextInt(101)};
		
		System.out.println(Arrays.toString(nums2));
	*/
		
		//Call getIntArray5 method and use it?
		
		int[] myNums=getIntArray5();
		
		System.out.println(Arrays.toString(myNums));
		
		System.out.println(Arrays.toString( getIntArray5() ));
		
		/*
		 * TODO: Create 2 arrays using getIntArray5 method and
		 * compare SUMS of both and print out which one is larger
		 */
		
		int []nums1= getIntArray5();
		int[]nums2= getIntArray5();

		int sumOfNums1=0, sumOfNums2=0;
		
		for(int num :nums1) {
			sumOfNums1+=num;
			
		}
		
		for(int num :nums2) {
			sumOfNums2+=num;
	}
	if(sumOfNums1>sumOfNums2) {
		System.out.println("First Array Sum is lagrger" +sumOfNums1);
		System.out.println("Second Array Sum is lagrger" +sumOfNums2);
	}else if(sumOfNums2>sumOfNums1) {
		System.out.println("Second Array Sum is lagrger" +sumOfNums2);
		System.out.println("First Array Sum is lagrger" +sumOfNums1);
	}else {
		System.out.println("Sum of both Arrays are equal" +sumOfNums1);
		System.out.println("Second Array Sum: " +sumOfNums2);
		
		
		
	}
	}
	public static int[] getIntArray5() {
		int[] nums = new int[5];
		Random rdm = new Random();
		
		for(int i=0; i<nums.length; i++) {
			nums[i] = rdm.nextInt(101);
		}
		
		return nums;
	}
}
	
	
	
	
	
