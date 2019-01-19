package day37_arrayList02;

import java.util.*;

public class MethodsWithList {
	
	public static void main(String[] args) {
		ArrayList<Integer> numsList = new ArrayList<>();
		numsList.add(1000);
		numsList.add(4000);
		numsList.add(10000);
		int result=sumList(numsList);
		System.out.println(result);
		System.out.println(sumList(numsList));
		
		List<Integer> myNums1 = new ArrayList<>();
		myNums1.add(100);
		myNums1.add(400);
		myNums1.add(1000);
		
		List<Integer> myNums2 = new ArrayList<>(myNums1);
		myNums2.add(543);
		myNums2.add(10);
		
		int sumResult = sum2Lists(myNums1 , myNums2);
		System.out.println(sumResult);
		
		System.out.println( buildIntList(500) );
		
		ArrayList<Integer> randomList=buildIntList(5000);
		
		System.out.println(randomList);
		
		System.out.println(sumList(  buildIntList(100) ) );
		
	}
	
	//how to write method that accepts an Arraylist
	//calculate sum of values and return
	public static int sumList(ArrayList<Integer> nums) {
		int sum=0;
//		for(int n : nums) {
//			sum+=n;
//		}
		for(int i=0; i<nums.size(); i++) {
			sum+=nums.get(i);
		}

		return sum;
	}
	
	/*
	 * method : sum2Lists
	 * Args: 2 Integer arraylists
	 * Return type: int
	 * Sum of both arraylists
	 */
	public static int sum2Lists(List<Integer> nums1, List<Integer> nums2) {
		int sum = 0;
		for (Integer num : nums1) {
			sum+=num;
		}
		
		for (Integer num : nums2) {
			sum+=num;
		}
		
		return sum;	
	}
	
	/*
	 * How to write a method that returns an ArrayList of integers
	 * 
	 * Method name: buildIntList
	 * Return type: ArrayList of integer
	 * Args: int
	 * 
	 * This method gets an int and creates an arraylist with that many random
	 * numbers between 0 - 100 and returns it
	 * 
	 */
	public static ArrayList<Integer> buildIntList(int count) {
		Random random = new Random();
		ArrayList<Integer> returnList = new ArrayList<>();
		for(int Z=1; Z <= count; Z++) {
			returnList.add( random.nextInt(101) );
		}
		
		return returnList;
		
	}
	
}
	
	
	
	
	
	
	
	
