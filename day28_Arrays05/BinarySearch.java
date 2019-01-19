package day28_Arrays05;

import java.util.Arrays;

public class BinarySearch {
public static void main(String[]args) {
	
	//BIMARY SEACH METHOD
	
	String []words= {"cake","tomato","wooden spoon","pizza"};
	
	Arrays.sort(words);
	
	System.out.println(Arrays.toString(words));
	
System.out.println(Arrays.binarySearch(words, "pizza"));
}
}
