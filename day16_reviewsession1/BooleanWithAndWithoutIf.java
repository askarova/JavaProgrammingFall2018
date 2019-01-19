package day16_reviewsession1;

public class BooleanWithAndWithoutIf {
	
	public static void main(String[]args) {
	
		//<, <=, >, >=, !=, ==
		// &&, ||, !, ^
		//& &&(short circuit)
		//& will test both conditions all the time
		//&& will not test both conditions if first one is false
		//5>6 & 4>5-> false 
		//5>6 && 4>5 -> false ,and will not test second condition
		//5>3 && 4>5 -> false, it will test both because first is true and second needs to be tested as well.
		// | ||(short circuit)
		// false|true-> true
		//5>6|| 4>5 -> false
		//6==6|| 3==1-> true and (3==1)will not be tested
		

		
		boolean b = 12>10;
		System.out.println(b);
		b= 12 >10 && 10<15;
		System.out.println(!!!!!!!!!!!!!b);
		//22100 -- 22200 ->McLean
		
	System.out.println(b);
	
	int zipCode = 22102;
	
	if(zipCode >= 22100 && zipCode <= 22200) {
		System.out.println("McLean");
	}else {
		System.out.println("Not McLean");
			
		
		
	}
	
	}
	
	
		
}

