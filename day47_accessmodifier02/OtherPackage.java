package day47_accessmodifier02;

import day47_accessmodifier01.Student;

public class OtherPackage {
	public static void main(String[]args) {
		
		Student student = new Student();
		
		student.name= "Mike";
		//student.ssn -> not visible/private
		//student.age = 44;-> not visible 
		//student.campus= "New York"-> not visible
		
	}

}
