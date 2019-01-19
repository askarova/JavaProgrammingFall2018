package day4_operators;

public class Shopping {
      public static void main(String[] args) {
	
	double apples = 10.5;
	double carrots = 3.8;
	double tomatoes = 6.2;
	
	double totalBeforeTax = apples + carrots + tomatoes;
	System.out.println("Total Before Tax" + totalBeforeTax);
	
	double tax = totalBeforeTax * 0.06;
	System.out.println("Total tax:" + tax);
	
	double grandTotal = totalBeforeTax +tax;
	System.out.println("Your total is $" + grandTotal);
			
	
}
}
