package day5_operators;

public class castingPrimitives {
	public static void main(String[] args) {

		int i = 100;
		byte b =(byte)i;
		
		double price = 12.5;
		int price2 = (int)price;
		
		System.out.println(price2);
		
//implicit casting examples:
		
		int count = 45566;
		double doubleCount = count;
		
		System.out.println(doubleCount);
		
		byte byteValue = 127;
		int intValue = byteValue; // int intValue = (int)byteValue;
		
//explicit casting
		
		int students = 70;
		byte byteStudents =(byte)students;
		
		System.out.println(byteStudents);
		
		
		
		
		
	}

}
