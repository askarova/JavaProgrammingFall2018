package day27_Arrays04;

public class SplitMethod {
 public static void main(String[]args) {
	 
	 String words= "java-selenium-cucumber-testing-junit-eclopse-maven-git-github";
	 
	 String []splittedWords=words.split("-");
	 
	 System.out.println(splittedWords.length);
	 System.out.println(splittedWords[0]);
	 
	for(String each:splittedWords) {
		System.out.println(each);
	}
 
	
	String searchResults = "All categories “wooden spoon” 13,623 Results";
	
	//if you have a sentence as a string, how do you find out how many words in it?
	//extract number of wooden spoon result and print out.
	
	String []arrResults =searchResults.split(" ");
	System.out.println("Words Count: " +arrResults.length);
	
	System.out.println(searchResults.split("")[0]);
	
	
	System.out.println("Wooden spoon count:" +arrResults[4]);
		
			
	
	
}
}

 
 
 

