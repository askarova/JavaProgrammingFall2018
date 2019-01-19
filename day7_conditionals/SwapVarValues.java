package day7_conditionals;

public class SwapVarValues {
	public static void main(String[]args) {
// swap variable values:
		
		int apples = 1;
		int oranges= 2;
		
		int tempContainer = apples;
		apples =oranges;
		oranges = tempContainer;
		
		System.out.println("Oranges: " + oranges + " apples: " + apples);
		
		
	}
	

}
