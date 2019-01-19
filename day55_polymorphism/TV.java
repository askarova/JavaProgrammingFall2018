package day55_polymorphism;

import java.util.ArrayList;
import java.util.List;


public class TV {
	
	public static void main(String[] args) {
		TV t=new TV();
		System.out.println(t);
		
		int []arr= {1,3,4};
		System.out.println(arr);
		
		List<Integer>lst=new ArrayList<>();
		lst.add(1);
		lst.add(2);
		lst.add(3);
		
		System.out.println(lst);
		
		Person p1=new Person("John", 25);
		System.out.println(p1);
		
		
	}
	
	@Override
	public String toString() {
		return "Tv to String METhod";
	}
	
	

}

