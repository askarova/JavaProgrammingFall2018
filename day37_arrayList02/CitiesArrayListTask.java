package day37_arrayList02;

//this package auto imported to every class

import java.lang.*;
import java.util.*;

public class CitiesArrayListTask {
public static void main(String[]args) {
	
	
	ArrayList<String>cities= new ArrayList<>();
	cities.add("Tokyo");
	cities.add("New York");
	cities.add("Paris");
	cities.add("Pittsburgh");
	cities.add("Berlin");
	cities.add("Madrid");
	cities.add("Moscow");
	cities.add("Istanbul");
	cities.add("Washington D.C.");
	cities.add("Amsterdam");
	cities.add("Zurich");
	cities.add("Singapore");
	cities.add("Milan");
	cities.add("Toronto");
	cities.add("London");
	
	int countOfCities= cities.size();
 System.out.println("Count of Cities in the list: " + countOfCities);
 
 
 for(String city:cities) {
	 System.out.print(city + " | ");
	 
 }
 System.out.println();
 
// System.out.println(cities.get(15)); index out of BoundException
 
 for(int i =0; i<cities.size(); i++) {
	 System.out.print(cities.get(i) + " | ");
 }
 System.out.println();
 
 ArrayList<String>longNames= new ArrayList<>();
 System.out.println(longNames.size());
 System.out.println("It is empty? :" + longNames.isEmpty());
 
 //for Each Loop
 
 for(String city: cities) {
	 if(city.length()>6) {
		 longNames.add(city);
		 
	 }
 }
 
 System.out.println(longNames);
 
 //FOR Loop
 
 System.out.println(longNames);
 System.out.println("Clearing LongNames ArrayList...");
	longNames.clear();// clear the arrayList, it will became empty like new
	
	System.out.println(longNames.isEmpty()+" " + (longNames.size()==0));
	
	
	for(int idx=0; idx<cities.size(); idx++) {
		String city = cities.get(idx);
		if ( city.length() > 6 ) {
			longNames.add(city);
			//longNames.add(cities.get(idx));
		}
	}
	
	System.out.println("Cities count with > 6 chars: " + longNames.size());
	System.out.println(longNames.toString());
}


 
 
	}

