package day22_loops05;

public class WarmUpNestedLoop {
  public static void main(String[]args) {
	  
	//modify nested loops above so that it prints this pattern:
	  
	//  12345678910
	//  123456789  
	//  12345678
	//  1234567
	//  123456
	//  12345
	//  1234
	//  123
	//  12
	//  1
	  
	  
	  for(int outer = 10; outer >= 1; outer--) {
			for(int inner = 1; inner <= outer; inner++) {
				System.out.print(inner+" ");
			}
			System.out.println();
		}
  }
}





