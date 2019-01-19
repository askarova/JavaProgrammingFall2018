package day40_customclasses;

public class CellPhoneFactory {
	public static void main(String[]args) {
	//create object from a CellPhone class	
		CellPhone phone1 = new CellPhone();
		phone1.brand= "Apple iPhone XS";
		phone1.color="Piano Black";
		phone1.price= 999.0;
		
		phone1.call();
		phone1.text();
		
		
		CellPhone phone2 = new CellPhone();
		CellPhone phone3 = new CellPhone();
		
		phone2.brand ="Ericson 1018";
		phone2.color= "Silver";
		phone2.price=30.5;
		
		phone3.brand ="HTC Evo";
		phone3.color= "Blsck";
		phone3.price=350.99;
		
		phone2.call();
		phone2.text();
	//cal object methods	
		phone3.call();
		phone3.text();
		
		System.out.println("phone1 brand - " + phone1.brand);
		System.out.println("phone2 brand - " + phone2.brand);
		System.out.println("phone3 brand - " + phone3.brand);
		
	//calculate total price for all 3 phones:
		double total =phone1.price +phone2.price+phone3.price;
		System.out.println("Total for all 3 phones:" + total);
		
   //can we update object values? YES
		phone1.price= 1200.0;
		phone2.price= phone3.price;
		
		System.out.println("Phone1 price : " +phone1.price);
		System.out.println("Phone2 price : " +phone2.price);
		System.out.println("Phone3 price : " +phone3.price);
		
	//	CellPhone.call(); will nor=t work, since it is not static
		
	}

}
