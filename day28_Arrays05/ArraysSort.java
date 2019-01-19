package day28_Arrays05;

import java.util.Arrays;

public class ArraysSort {
public static void main(String[]args) {
	
	int[]nums= {9,4,3,0,6,-4,5,3,10};
	
	for(int n :nums) {
		System.out.print(n + " ");
	}
	System.out.println();
	
      Arrays.sort(nums);
      
      for(int n: nums) {
    	  System.out.print(n + " ");
      }
      System.out.println();;
      
      String []names = {"Asiiat", "Baktygul", "Khalili", "Z", "Tymur"};
      
      Arrays.sort(names);
      
      for(String name:names) {
    	  System.out.print(name + " ");
      }
      System.out.println();
      
      char[]charArray = {'c','C','D','A','2'};
     
      Arrays.sort(charArray, 0,3);//partially sort 
      for(char ch: charArray) {
      System.out.print(ch + " ");
      
}
}
}

