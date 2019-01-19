package day55_polymorphism;

public class MainRunner {

	public static void main(String[] args) {
		
		Person p1 = new Person("John", 25); 
		Object p2 = new Person("Serik",27);
		Object o1 = "abc" ; 
//		
//		Person p3 = (Person) p2 ; 
//		
//		printPerson(p1);
		printPerson(o1);
	}

	public static void printPerson(Object o) {
		System.out.println("second printPerson is being used");
		System.out.println(o);
		// o--> String 
		if( o instanceof Person ) { 
			Person p =  (Person) o ;
			System.out.println(p.getAge());
		}else {
			System.out.println("WHAT YOU PASSED IS NOT A PERSON");
		}
	}

	
	
	public static void printPerson(Person p) {
		System.out.println("first printPerson is being used");
		System.out.println(p);
	}

}
