package day36_overloading_arraylist;

import java.util.ArrayList;

public class WrapperArrayListValues {
public static void main(String[]args) {
	  
	Integer n= 1000;
	int n2=100;
	
	ArrayList<Integer>nums= new ArrayList<>();
	nums.add(300);
	nums.add(500);
	nums.add(1234);
	nums.add(654);
	
	System.out.println(nums);
	System.out.println(nums.toString());
	
	//for EACH loop
	
	for(Integer num :nums) {
		System.out.println(num);
	}
	System.out.println("============");
	for(int num: nums) {
		System.out.println(num);
		
	// print each value using for loop
		
		System.out.println("============");
		for(int i=0; i<nums.size();i++) {
		System.out.println(nums.get(i));
		
		}
		
	}
}
}
