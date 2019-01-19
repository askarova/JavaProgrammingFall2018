package day11_switchcase;

public class SwitchCase {
public static void main(String[]args) {
	
	//1-lobby,2-google, 3-cyberteck, 4-apple
	
	int floor=3;
	
	if(floor==1) {
		System.out.println("Lobby");
	}else if(floor ==2) {
		System.out.println("Google");
	}else if(floor ==3) {
		System.out.println("Cyberteck");
	}else if(floor ==4) {	
		System.out.println("Apple");
	}else {
		System.out.println("No Such floor");
		
		}
	switch(floor) {
	case 1:
		System.out.println("Lobby");
		break;
	case 2:
		System.out.println("Google");	
		break;
	case 3:
		System.out.println("Cyberteck");	
		break;
	case 4:
		System.out.println("Apple");	
		break;
	default:
		System.out.println("No Such floor");	
		
		
	}
	
	
}
	
	
	
	
	
}



