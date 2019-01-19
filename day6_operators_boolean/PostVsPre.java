package day6_operators_boolean;

public class PostVsPre {
public static void main(String[]args) {
	
	int number = 10;
	int number2 = number ++;//assign value to variable
	                        //increase value by one
	
	System.out.println("number2:" +number2);
	System.out.println("number :" + number);
	
	int tomatoes= 5;
	int bag = ++ tomatoes;//add one
	                      //assign value to bag
	System.out.println("tomatoes:" + tomatoes);
	System.out.println("in the bag:" + bag);
}

}
