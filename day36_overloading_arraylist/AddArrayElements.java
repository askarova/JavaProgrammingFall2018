package day36_overloading_arraylist;

import java.util.Arrays;

	public class AddArrayElements {
		
		public static void main(String[] args) {
			int[] arr1 = {4,5,6,7,8};
			int[] arr2 = {1,2,6,3,6};
			//            5,7,12,10,14
			
			int[] arr3=addElements(arr1 , arr2 );
			
			//print all values in single line
			System.out.println( Arrays.toString(arr3) );
			
			arr3 =addElements(new int[] {4,5,3,1,3} , 
					          new int[] {1,2,3,4,5});
			System.out.println( Arrays.toString(arr3) );
		}
		
		/*
		 * method name: addElements
		 * args: 2 int arrays
		 * return: int array
		 * Adds each element value of arg arrays and returns a new array
		 * each arg array has 5 elements
		 * 1-> 1, 2, 3 ,4, 5
		 * 2-> 11, 22, 33 ,44, 55
		 * 
		 */
		public static int[] addElements(int[] ints1, int[] ints2) {
			//create a new array here
			int[] newArray = new int[ints1.length];
			//go to each elem in arrays and add them
			for(int i=0; i<newArray.length;i++) {
				newArray[i] = ints1[i] + ints2[i];	
			}
			
			return newArray;
			
		}
		
	
		
	}

