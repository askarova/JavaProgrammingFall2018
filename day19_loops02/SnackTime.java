package day19_loops02;


public class SnackTime {
public static void main(String[]args) {
	//create a boolean variable and assign true to it
	//create int variable apples and assign 1 to it
	//as long as you are hungry print "eating an apple"
	//and increase the apple
	//once you eat 5 apples, you are  no hungry
	
	boolean hungry = true;
	int apples = 1;
	
	while(hungry) {
		System.out.println("Eating an apple");
		if(apples == 5) {
			hungry = false;
		}else {
			apples++;
		}
	}
	
	System.out.println("Apples total:" + apples);
	
	
}
}
	


