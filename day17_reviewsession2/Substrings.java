package day17_reviewsession2;

public class Substrings {
	public static void main(String[]args) {
		
		//create a variable diceResults
		//assign 1-30 of 1,367 positions
		//using substring extract number of open positions
		
	String diceResults = new String("1-30 of 1,367 positions");
	String positions = diceResults.substring(10, 15);
	
	System.out.println(positions);

	String languages = new String ("Java, Fortrun, English, Cobol, Ruby, C#");
	String lan1,lan2,lan3,lan4,lan5,lan6;
//using substring assign each language to each variable.
// for the last language just pass one number to substring
	
  lan1= languages.substring(0,4);
  lan2= languages.substring(6,13);
  lan3= languages.substring(15,22);
  lan4= languages.substring(24,29);
  lan5= languages.substring(31,35);
  lan6= languages.substring(37);
  
 System.out.println(lan1);
 System.out.println(lan2);	
 System.out.println(lan3);
 System.out.println(lan4);
 System.out.println(lan5);
 System.out.println(lan6);
}
}


