package day12_classObject_Strings;

public class Directions {
  public static void main(String[]args) {
	  
	  char start, end;
	  start ='A';
	  end ='D';
	//check if all valid
	if(!(start >= 'A' && start <='D' && end >= 'A' && end <= 'D')) {
		
		System.out.println("invalid start or end");
	}else if(start==end) {
		System.out.println("Already there");
	}else if(start == 'A') {
		if(end=='B') {
			System.out.println("Go right");	
	}else if(end == 'C') {
		System.out.println("Go right-> go down");
	}else if(end=='D') {
		System.out.println("Go right-> go down->go left");
		
	}
		
	}else if (start =='B')	{
		if(end=='A') {
			System.out.println("Go down-> go left->go up");	
	}else if(end=='C') {
			System.out.println("Go down");
	}else if(end=='D')	{
		System.out.println("Go down-> Go left");
	}
	}else if(start == 'C') {
		if(end=='A') {
			System.out.println("Go left-> Go up");	
	}else if(end =='B') {
			System.out.println("Go left-> Go up->Go right");	
	}else if(end=='D')	{
		System.out.println("Go left");
			
		}
	}else if(start=='D') {
		if(end=='A') {
		System.out.println("Go up");
	}else if(end=='B') {
		System.out.println("Go up -> Go right");
	}else if(end=='C')	{
		System.out.println("Go up-> Go right -> Go down");
		
		
		
		
	}
		
		
	  
	

	
}
	  
	  
	  
	  
	  
	}
	  
	  
  }

