package day46_this_isa;

public class CalcTest {
	public static void main(String[] args) {
		Calc c = new Calc();
		c.plus(10);
		System.out.println(c.getResult());
		
		c.plus(5).plus(15).plus(10).plus(3).minus(3);
		
		System.out.println(c.getResult());
		
		
	}
}
