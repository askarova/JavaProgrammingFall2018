package day29_Arrays06;

public class MultiDAyyays {
   public static void main(String[]args) {
	   
	   int[][]nums= new int[2][3];
	   
	   nums[0][0]=10;
	   nums[0][2]=20;
	   nums[0][2]=30;
	   
	   nums[1][0]=40;
	   nums[1][1]=50;
	   nums[1][2]=60;
	   
	   int[][] nums2= { {10,20,30} ,{40,50,60}};
	   
	   //basic reading by passing indexes
	   
	   System.out.println(nums[0][2]);
	   System.out.println(nums[0][0]);
	   
	   //reading length from 2D array:
	   //find out how many 1D arrays are in 2D array:
	   
	 System.out.println("Number of arrays:" +nums.length);
	 System.out.println("Number of values in fisrt array: "+ nums[0].length);
	 System.out.println("Number of values in swcond array: "+ nums[1].length);
	   
	   
	 int [][]num2= { {10,20,30},{40,50,60},{70,80}};
	 
	 System.out.println(nums.length);
	 System.out.println(nums[0].length);
	 System.out.println(nums[1].length);
	 
	   
	   
	   
	   
	   
   }
}
