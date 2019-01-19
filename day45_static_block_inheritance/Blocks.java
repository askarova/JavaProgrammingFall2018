package day45_static_block_inheritance;

public class Blocks {
	
	static int num= 100;
	static String str;
	
	static {
		num = num + 1000;
		str = "Hello";
	}
	{

 num += 500;
 str = str + "world";
	}
 
	public Blocks() {
		num = num *2;
		str= str + "!!!";
	}
	}
 