package day50_final_super_abstraction;

public class ProductTests {
	public static void main(String[]args) {
		
		Product p1= new Product("Sony Play Station");
		
		System.out.println(p1.toString());
		
	Electronics el= new Electronics ("Dyson vacuum", 450.50);
	
	System.out.println(el.toString());
	el.buy();
	
	System.out.println(Product.IS_AVAILABLE);
	System.out.println(Electronics.IS_AVAILABLE);
	
	
		
	}

}
