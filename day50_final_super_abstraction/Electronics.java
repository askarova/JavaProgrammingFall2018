package day50_final_super_abstraction;

public class Electronics extends Product{
	
	
		private double price;
		

		public Electronics(String name, double price) {
			super(name);
			this.price = price;
		}
		
		public Electronics() {
			setName("Unknown Electronics");
			//super("Unknown Electronics"); <== will also work
		}
		
		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}
		
		@Override
		public String toString() {
			//return "Name: " + getName() + " | Price: " + price;
			return super.toString() + " | Price: " + price;
			
			
		}
		
		public void buy() {
			
			super.buy();
			System.out.println("Total price is " + price);
		}
}

