package day22_loops05;

public class NestedLoopExample {
  public static void main(String[]args) {
	  
//write a program that prints numbers from 1 to 10 in same line/FOR LOOP
//add one more for loop and put everything from 14-17. needs to loop 5 times	  
	 
		//for(int j = 1; j<=3; j++) {
			//for (int i = 1; i <= 10; i++) {
				//System.out.print(i + " "); 
			//}
			
			//System.out.println();
		//}
		
		//	System.out.println("Outside the loop");
			//}

//{
	

//modify nested loops above so that it prints this pattern:
//1
//12
//123
//1234
//12345
//123456
//1234567
//12345678
//123456789
//12345678910

	for(int j = 1; j <= 10; j++) {//j = 1,2,3
		for(int i = 1; i <= j; i++) {//i=
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
	System.out.println("Outside the loop");
}
}

