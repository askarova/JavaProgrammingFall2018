package day43_static;

public class Campustesters {
	public static void main(String[]args) {
		
		Campus.city = "McLean";
		Campus.AboutCampus();
		
		Campus c= new Campus();
		System.out.println(c.city);
		c.AboutCampus();
		
		
	}

}
