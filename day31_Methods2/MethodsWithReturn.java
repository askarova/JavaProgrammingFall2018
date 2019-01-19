package day31_Methods2;

public class MethodsWithReturn {
	
	public static void main(String[] args) {
		int amount = giveme5$();
		
		System.out.println(amount);
		
		System.out.println( giveme5$() );
		//get president name from the method and assign to president.
		//then print out "US president is [president]
		String president=getPresidentName();
		System.out.println("US president is " + president);
		
		System.out.println("US president is " + getPresidentName());
		
		System.out.println( getPresidentName() );
		
		String firstName = getFirstName();
		String lastName = getLastName();
		String email = firstName +"_"+lastName + "@gmail.com";
		System.out.println(email);
		        //  "Mike"         _      "Smith"
		email = getFirstName() + "_" + getLastName() + "@yahoo.com";
		System.out.println(email);
		
		
		
	}
	

	public static int giveme5$() {
		int d = 5;
		return d;
	}

	public static String getPresidentName() {
		return "Donald Trump";
	}


	public static String whatisYourName() {
	 	String name = "Murodil";
		return name;
	}
	
	//Methods 1) getFirstName, 2) getLastName
	//main you will call these methods and build an email. 
	//String email = [firstname]_[lastname] @gmail.com
	
	public static String getFirstName() {
		return "Mike";
	}
	
	
	public static String getLastName() {
		return "Smith";
	}
	
}