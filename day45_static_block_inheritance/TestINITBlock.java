package day45_static_block_inheritance;

public class TestINITBlock {
	public static void main(String[] args) {
		ClassWithINITBlock.staticMethod();
		ClassWithINITBlock one = new ClassWithINITBlock();
		ClassWithINITBlock two = new ClassWithINITBlock();
		ClassWithINITBlock three = new ClassWithINITBlock();

	}
}