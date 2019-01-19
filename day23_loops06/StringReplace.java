package day23_loops06;

public class StringReplace {
  public static void main(String[]args) {
	  String sentence ="We are learning java";
	  System.out.println(sentence);
	  
	  sentence = sentence.replace("Java", "C");
	  System.out.println(sentence);
	  
	  //can u replace word learning to practicing 
	  
	  sentence= sentence.replace("learning","practicing");
	  
	  System.out.println(sentence);
	  
	  sentence=sentence.replace("phython","Java");
	  System.out.println(sentence);
	  
	  sentence=sentence.replace("a","A");
	  System.out.println(sentence);
	  
	  		
	  		
	  		

  }
}
