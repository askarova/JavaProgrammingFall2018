package day16_reviewsession1;

public class Operators {
	
	//arithmetic: +, -,/, *, %
	//shorthand assignment: +=, -=, /=, *=, %=
	//increment/ decrement: --, ++
	//Comparison: >=, <=, ==,!=
	
	
	public static void main(String[]args) {
		
		//distance in miles, pace/ speed per hour
		//How many minutes it will take to reach destination 
	
	//50 miles to go
	//5 mph -> ho many minutes 
	
	
	double distance = 34;
	double pace = 20;
	
	double minutes = distance / pace * 60;
	System.out.println("Minute to reach desrination:" + minutes);
	
//you spent 5 minutes in traffic 
	minutes += 5.0;
// you spent 1 minute extra coz you took a wrong turn
	minutes++;
	
	System.out.println("Finally it takes: " + minutes +"minutes");
	
	
	int number = 10;
			System.out.println(number/3); //3
	        System.out.println(number %3); // 1 (remainder)
	        
	        System.out.println(number);
	        ++ number; // add 1
	        System.out.println(number);
	        number ++; // add 1
	        System.out.println(number);
	
	        
	        int num2 = number++;
	        System.out.println(num2);
	        System.out.println(number);
	        //13       +      14
	        num2= ++number + number++;
	        
	        System.out.println(num2);//28
	        System.out.println(number);//15
	}
	
	
	

}
