package day9_conditionals;

import java.util.Scanner;

public class CreditScore {
   public static void main(String[]args) {
	   
	   int creditScore;
	   
	   Scanner scan=new Scanner(System.in);
	   
	   System.out.println("Please enter you credit score");
	   
	   creditScore=scan.nextInt();
	   
	String creditStatus="Unknown";
	int percentage =0;
			
	if(creditScore <0 || creditScore >850) {
		creditStatus= "Invalid Credit Score. Can no be negative or more than 850";
	}else if(creditScore==0) {
		creditStatus= "No Credit History";
	}else if (creditScore >=1 && creditScore <=299) {
		creditStatus= "Bad Credit";
	}else if(creditScore >=300 && creditScore <=579) {
		creditStatus="Very poor credit";
		percentage =16;
	}else if(creditScore >=580 && creditScore <=669) {
		creditStatus= "Fair Credit";
		percentage =18;
   }else if(creditScore >= 670 && creditScore <=739) {
	   creditStatus= "Good Credit";
	   percentage =21;
   }else if(creditScore >= 740 && creditScore <=799) {
	   creditStatus= "Very Good credit";
	   percentage =25;   
   }else if(creditScore >=800 && creditScore <=850) {
	   creditStatus= "Exceptional credit";
	   percentage=20;
	   
	   }
	System.out.println(creditStatus);
	System.out.println("Percentage in USA: " +percentage);
	
	}
}





   

