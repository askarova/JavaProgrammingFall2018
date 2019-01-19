package day45_static_block_inheritance;

public class ClassWithINITBlock {

	{
		System.out.println("This is Initializer block. I run automatically every time object is created. I run before constructor");
	}
	
	static{
		System.out.println("Static block. I run one time before. Init or constructor. But ONCE only");
	}
	
	public ClassWithINITBlock() {
		System.out.println("This is a Constructor. I run every time object is created");
	}
	
	public static void staticMethod() {
		System.out.println("Static method");
	}
	
}

