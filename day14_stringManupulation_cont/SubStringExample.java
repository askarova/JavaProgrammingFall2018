package day14_stringManupulation_cont;

public class SubStringExample {
	public static void main(String[]args) {
// substring gets part of a string
// there are two versions, 1 takes 1 int, 1 takes 2 ints
// if it takes 1 int, it means starting point
// we can not give a number bigger than the length, it will throw an exception
// if will give a number equal to the length , it will return empty string
	
	
	String str = "donaldtheduck@gmail.com";
	System.out.println(str.substring(14));
// 2 INT 
// first number is where the new string will string from
// second number is where the new string will end
 System.out.print(str.substring(20,20));
	
	
	
	
	
	
	}
	

}
