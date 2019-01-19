package day49_inheritance03;

public class SearchTest {
	
	public static void main(String []args) {
		
		SearchEngine srch= new SearchEngine();
		srch.search("iphone charger");
		
		Google google = new Google();
		google.search("Java overriding rules");
		
		Etsy etsy = new Etsy();
		etsy.search("Wooden Spoon");
	}

}
