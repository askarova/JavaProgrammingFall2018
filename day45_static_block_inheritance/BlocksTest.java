package day45_static_block_inheritance;

public class BlocksTest {
	public static void main(String[] args) {
//		System.out.println(Blocks.num);//1100
//		System.out.println(Blocks.str);//Hello
//		
		System.out.println(Blocks.num);//1100
		System.out.println(Blocks.str);//Hello
		
	    Blocks b1 = new Blocks();
		
		System.out.println(Blocks.num); //3200
		System.out.println(Blocks.str); //Hello world!!! 
	
//		Blocks b2 = new Blocks();
//		
//		System.out.println(b2.num);//7400
//		System.out.println(b2.str);//Hello world!!! world!!!
//		
		
	}
}

