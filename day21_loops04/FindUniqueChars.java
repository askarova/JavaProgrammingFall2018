package day21_loops04;

public class FindUniqueChars {
    public static void main(String[]args) {
    //Accept a String and print only unique characters in the string
    //speedLimit
    	
    	String word ="AABBCCDD ";
    	
    	String unique = "";
    //	int i=2;
    //	System.out.println(word.substring(i,i+1));
    	
    	
    	for(int i =0; i<word.length(); i++) {
    	
       //System.out.println(word.substring(idx,idx+1));
    	if (!unique.contains(word.substring(i, i+1))) {
    		unique+=word.substring(i, i+1);
    		
    	}
    }
System.out.print(unique);
    }
}

