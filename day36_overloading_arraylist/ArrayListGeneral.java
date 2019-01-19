package day36_overloading_arraylist;

import java.util.ArrayList;

public class ArrayListGeneral {
	public static void main(String[] args) {
		//create a general(raw type) arraylist.
		//We can add any type of data to this list.int, double, String etc
		ArrayList list = new ArrayList();
		list.add("Java");
		list.add("Eclipse");
		list.add("Slack");
		list.add(456);
		list.add(true);
		
		System.out.println(list);
		
		list.add(345.2);
		list.add('_');
		
		System.out.println(list);	
		System.out.println( list.get(0) );
		
		System.out.println( list.size() ) ;
		
		list.add("water");
		list.add("Bless you");
		
		System.out.println( list.size() ) ;
		
	}
}
	
	