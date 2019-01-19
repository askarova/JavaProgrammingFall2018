package day40_customclasses;

public class MovieTester {
	public static void main(String[]args) {
		
		//create 3 movies
		
		Movie internship = new Movie();
		Movie gladiator = new Movie();
		Movie starWars= new Movie();
		
	System.out.println(internship.name);// prints null 
	System.out.println(internship.length); // 0
	
	internship.name ="Internship";
	gladiator.name = "Gladiator";
	starWars.name= "StarWars";
	
	internship.length = 119;
	gladiator.length = 140;
	starWars.length = 150;
	
	internship.watch();
	gladiator.watch();
	starWars.watch();
	
	internship.buy(10.77);
	gladiator.buy(23.50);
	starWars.buy(22.0);
	
	}

}
