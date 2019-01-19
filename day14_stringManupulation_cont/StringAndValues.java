package day14_stringManupulation_cont;
//this is the name of the class,everything happens inside the class
public class StringAndValues {
// declaring a variable without any value.
// java will put null value by default
	static String str;
//we are declaring a main method 
	
	public static void main(String[]args) {
// will print null because null value assigned		
		System.out.println(str);
//assigning value into str
		
	
		str = "a";
//will print a
		System.out.println(str);
// assigning another value into str
		str = "b";
//will print b
		System.out.println(str);
// printing current value of str ('b' and AAA)		
		System.out.println(str + "AAA");
//print current value of str 'b'
		
		System.out.println(str);
//changing the value of str/
//str is now equal to bAAA
	str = str + "AAA";
	System.out.println(str);


	
//created a new variable and gave value 'a'
	String mystring = "a ";
//printing the trimmed version of mystring
//this line will not affect original value of mystring variable
	System.out.println(mystring.trim());
//prints value of mystring which still contains spaces
	
	System.out.println(mystring);
	
	
}

}
