package mondayLoopsProject;

import java.util.Scanner;

public class Part2Question6 {
     public static void main(String[]args) {
    	 
    	 
  System.out.println("Input a number");
  
  Scanner scan =new Scanner(System.in);
  
  int num1=scan.nextInt();
  
  for (int i=0; i< 10; i++){
	   System.out.println(num1 + " x " + (i+1) + " = " + 
	     (num1 * (i+1)));
     }
}
}
