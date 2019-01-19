package day37_arrayList02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ArrayListManipulations {

	public static void main(String[]args) {
//create arrayList fruits using 5 different ways
//fruits1..
		
		ArrayList<String> fruits1= new ArrayList<>();
		List<String> fruits2= new ArrayList<>();
		List<String> fruits3= new ArrayList<>(10);
		ArrayList<String> fruits4= new ArrayList<>(fruits1);
		List<String> fruits5= Arrays.asList(new String[] {"watermelon", "kiwi", "apple", "lemon"});
	    List<String> fruits6 = new ArrayList<>(fruits5);
	    fruits6.add("Cherry");
	    List<String> fruits7= new ArrayList<>(Arrays.asList(new String [] {"plum", "Cherry", "Mango"}));
	    fruits7.add("pears");
// add values
	    
	    fruits1.add("Grapes");
	    fruits1.add("Tomato");
	    fruits1.add("Blueberries");
	    fruits1.add("BlackBerries");
	    fruits1.add(0,"Orange");
	    fruits1.add(4, "Strawberries");
	    
	    System.out.println(fruits1);
// add all values from fruits 1	    
	    fruits2.addAll(fruits1);
	    fruits2.add("Dragon Fruit");
	    
	    System.out.println(fruits2);
//remove elements one by one	    
	    
	    fruits1.remove(0);
	    System.out.println(fruits1);
	    fruits1.remove("Strawberries");
	    System.out.println(fruits1);
	    
//remove all elements from fruits1 from fruits2
	    fruits2.removeAll(fruits1);
	    System.out.println("Fruits2:" + fruits2);
	    
	    
	    fruits1.clear();
	    System.out.println(fruits1);
	    
	    List<Integer> nums= new ArrayList<>();
	    nums.add(2);
	    nums.add(3);
	    nums.add(4);
	    nums.add(5);
	    
	    System.out.println(nums);
//remove 3
	    nums.remove(new Integer(3));
	    System.out.println(nums);
	    
//remove 2
	    nums.remove(new Integer(2));
	    System.out.println(nums);
	    
	    
	    
	    
	    
		
}
}
