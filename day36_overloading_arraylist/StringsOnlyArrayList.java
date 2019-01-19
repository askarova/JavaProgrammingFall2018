package day36_overloading_arraylist;

import java.util.ArrayList;

public class StringsOnlyArrayList {

public static void main (String[]args) {
	
	//ArrayList<String>names;
	//names= new ArrayList<>();
	
	ArrayList<String>names= new ArrayList<>();
	names.add("Ali");
	names.add("Asiiat");
	names.add("Cam");
	names.add("Khalili");
	names.add("Z");
	names.add("Anastasia");
	
	//print all in same line
	
	System.out.println(names);
	
	names.add("James");
	System.out.println(names);
	
	
	// get size/ number of elements
	
	int length= names.size();
	System.out.println("Number of Names : "+ length);
	
	//read first person name
	String first= names.get(0);
	System.out.println("First name: " + first);
	
	//read last person name
	
	String last = names.get(names.size()-1);
	System.out.println("Last :" + last);
	
	//remove the element from the list
	
	names.remove(0);
	System.out.println(names);
	
	names.remove(2);
	names.remove("Z");
	
	System.out.println(names);
}
	
}