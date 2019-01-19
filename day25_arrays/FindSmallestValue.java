package day25_arrays;

public class FindSmallestValue {
   public static void main(String[]args) {
	   
	   //create array nums and assign several values
	   //print the smallest value 
	   
	   int nums []= {-100, -230,345,123,0};
	   
	   int smallest=nums[0];
	   
	   for (int n : nums) {
		   if(n <smallest) {
			   smallest =n;
			   
		   }
	   }
	 System.out.println(smallest);  
   }
}

