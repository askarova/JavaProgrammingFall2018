package day16_reviewsession1;

public class Budget {
	public static void main(String[]args){
		
	

	//print items you can purchase on your budget
	//<80 -> cannot buy anything
	//>435 -> you can buy everything
	//if budget >= phone + watch you can buy phone +watch
	//or phone+bag 
	//watch + bag
	// if budget >= phone + bag
	//you can buy phone+bag
	//or watch +bag
	//if your budget is >=watch +bag 
	//you can buy watch+bag 
	//
	//if budget >=phone
	//you can buy phone
	//or watch +bag
	//if budget >= watch 
	//you can buy watch // or bag
	//else 
	//just a watch
	
	double budget =500;
	
	double phone =250.0;
	double watch =105.5;
	double bag = 80.00;
	
	
	if(budget< 80.0) {
		System.out.println("Cannot buy anything");
		
	}if (budget >=435.5) {
		System.out.println("You can buy all items");
	
		
	} else if (budget >= phone + watch) {
		System.out.println("You can buy Phone +Watch OR Phone + Bag OR watch + Bag");
		
	} else if (budget >= phone +bag); {
		System.out.println("You can buy Phone OR watch + bag");
				
	 if (budget >= watch) {
		System.out.println("You can buy a watch or a bag");
		
	} else {
		System.out.println("You can buy a bag");}
	
	}
	}}



	

