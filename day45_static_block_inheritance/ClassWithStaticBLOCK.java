package day45_static_block_inheritance;

public class ClassWithStaticBLOCK {
	static {
		System.out.println("This is static Block. i run once in the beginning");
	}
	
	static {
		System.out.println("This is second static Block. i run once in the beginning");
	}
	
	public ClassWithStaticBLOCK() {
		System.out.println("This is a Constructor. I run every time object is created");
	}
	
	public static void staticMethod() {
		System.out.println("This is static method");
	}
	


}
