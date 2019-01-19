package day40_customclasses;

public class Employee {
	//Instance variables: firstname, lastname, email,jobTitle,salary

	String firstName;
	String lastName;
	String email;
	String jobTitle;
	double hourlySalary;
	
	public void work() {
		System.out.println(firstName+ " is working as " + jobTitle);
	}
	
	public static void main(String[]args) {
		Employee emp1 = new Employee();
		emp1.firstName = "Mike";
		emp1.lastName ="Smith";
		emp1.email = emp1.firstName+emp1.lastName+"gmail.com";
		emp1.jobTitle= "Scrum Master";
		emp1.hourlySalary = 65.50;
		
		System.out.println("Firstname: " +emp1.firstName);
		System.out.println("Lastname: " +emp1.lastName);
		System.out.println("Job Title: " +emp1.jobTitle);
		System.out.println("Salary: " +emp1.hourlySalary);
		
		
	}
	
	
}
