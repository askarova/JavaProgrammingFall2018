package day25_arrays;

import java.util.Random;
import java.util.Scanner;

public class LargeArray {
  public static void main(String[]args) {
	  
	  Scanner scan= new Scanner(System.in);
	  Random random=new Random();
	  
	  System.out.println("How many items in array?");
	  int count=scan.nextInt();
	  
	  int[]nums =new int[count];
	  
	  for(int i =0; i<count; i++) {
		  nums[i]=random.nextInt(1000);
		  
	  }
	  for (int n: nums) {
		  System.out.print(n + ",");
	  }
  }
}
