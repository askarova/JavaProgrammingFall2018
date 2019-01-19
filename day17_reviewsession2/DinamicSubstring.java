package day17_reviewsession2;

public class DinamicSubstring {
    public static void main(String[] args) {
    	
    	String sentence = "We are learning C++ programming";
    	//indeOf->accepts a string and finds the position
    	//String str ="abc"
    	//str.indexOf("b")-> 1
    	//str.indexOf("starts") -> 4
    	
    	//find the position of "learning"
    	//find the position of "programming"
    	//pass those numbers to substring and retrieve "C++"
    	
    	String sentence1 = "We are learning C++ programming";	
	//find the position of "learning"
    	
    
	int start = sentence1.indexOf("learning");
	int end = sentence1.indexOf("programming");
	System.out.println(start);
	System.out.println(end);
	
	start += "learning".length();
	
	String language = sentence1.substring(start, end);
	System.out.println(language.trim());
	
	
	
}
}
