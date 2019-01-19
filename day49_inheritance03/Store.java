package day49_inheritance03;

public class Store {
	private String type;
	private double rent;
	
	/*
	 * 3 constructors:
	 * 	1. accepts type.  
		  prints "Store constructor with Type: " + type	
	 *  2. accepts rent  
	 *  	  prints "Store constructor with rent: " + rent	

	 *  3. accepts type and rent
	 *  	  prints "Store constructor with Type: " + type +" and rent: " + rent	
	 */
	public Store(String type) {
		System.out.println("Store constructor with Type: " + type);	
		this.type = type;
	}
	
	public Store(double rent) {
		this.rent = rent;
		System.out.println("Store constructor with rent: " + rent);
	}
	
	public Store(String type, double rent) {
		System.out.println("Store constructor with Type: " + type +" and rent: " + rent	);
		this.type=type;
		this.rent = rent;
	}
	
	public double getRent() {
		return rent;
	}

	public void setRent(double rent) {
		this.rent = rent;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public String getType() {
		return type;
	}
}



