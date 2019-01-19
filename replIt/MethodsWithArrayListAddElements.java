package replIt;
import java.util.Arrays;

public class MethodsWithArrayListAddElements {
public static void main(String[]args) {
	
//Method addElements accepts 2 int arrays and adds each element value of two arrays
//and returns a new array. 
//You can assume that each array has 5 elements	
	
	
	
		int[] arr1 = {10, 40, 50, 3, 1};
		int[] arr2 = {11, 0, 500, 44, 1101};
		
		int[] arr3=addElements(arr1 , arr2 );
		
		//print all values in single line
		System.out.println( Arrays.toString(arr3) );
		
		arr3 =addElements(new int[] {10, 40, 50, 3, 1} , 
				          new int[] {11, 0, 500, 44, 1101});
		System.out.println( Arrays.toString(arr3) );
	}
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





	





	
	
	
	


