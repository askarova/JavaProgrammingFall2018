package day41_classes02_encapsulation;

public class HouseTester {
	public static void main(String[]args) {
		
	//step 1. Create House object and assign data to fields/ ins variables
		
		House yourHouse= new House();
		yourHouse.type ="Catle";
		yourHouse.address= "100 Ave C, Washington DC 22001";
		yourHouse.bedrooms =250;
		yourHouse.year= 2018;
	
	//step 2. Pass your house object to printHouseInfo method
		
		printHouseInfo(yourHouse);
		
	//create on more object of house and pass it to method
	
	House myHouse= new House();
	myHouse.type ="Studio";
	myHouse.address =" 45 Parkway Ave, NY 11002";
	myHouse.bedrooms= 1;
	myHouse.year= 2015;
	
 // step 2. pass my house to printHouseInfo method
	printHouseInfo(myHouse);
	
 House returnHouse= buildAHouse("Loft", " 77 Wooden Spoon lane, New York 11230", 2, 1999);
 System.out.println(returnHouse.address);
 printHouseInfo(returnHouse);
	
	
		
	}



public static void printHouseInfo(House house) {
	System.out.println("===========");
	System.out.println("Type: " + house.type);
	System.out.println("Address: " + house.address);
	System.out.println("Bedrooms #: " + house.bedrooms);
	System.out.println("Year: " + house.year);
	System.out.println("============");
}


// Method buildAHouse
//param: 4 -->2 Strings, 2-> ints
//Return type: House

//In the method, using the values of the parameters buls a new House object
//then return that.

public static House buildAHouse(String type, String address, int rooms,int year) {
	
	House newHouse= new House();
	
	newHouse.type = type;
	newHouse.address = address;
	newHouse.bedrooms= rooms;
	newHouse.year = year;
	
	return newHouse;
	
	
	
	
	
}

}











