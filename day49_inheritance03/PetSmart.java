package day49_inheritance03;

public class PetSmart extends Store {
	
	public PetSmart() {
		super("PetStore");
		System.out.println("PetSmart no args constructor");
	}
	
	public PetSmart(double rent) {
		super("PetStore", rent);
		//this(); not good. this(), super() both need to be first statements
		System.out.println("PetSmart Constructor with rent:" + rent);
	}
	
	
}
