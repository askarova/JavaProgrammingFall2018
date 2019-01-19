package day11_switchcase;

public class Calculator {
public static void main(String[]args) {
	
	double num1, num2,result;
	char operator;
	
	num1=5;
	num2=3;
	operator= '+';
	
	switch(operator) {
	
	case '+':
		result =num1 + num2;
		break;
	case '-':
	result=num1 - num2;
	break;
	
	case '*':
	result = num1 * num2;
		break;
		
	case '/':
		result=num1 / num2;
		break;
	case '%':
	     result=num1 % num2;
	     default:
	    	 System.out.println("ERROR: Invalid operator");
	    	 return;// dont run the rest of code below.
	}
	System.out.println(result);

}
	
}
