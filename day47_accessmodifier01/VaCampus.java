package day47_accessmodifier01;

public class VaCampus {
	
	VaCampusStudent campusStudent = new VaCampusStudent();
	
	public static void main(String[]args) {
		
		Student student = new Student();//object
		
		student.name = "Amina";// public.
		// student.ssn ->ssn is private. 
		student.age = 25;
		student.campus= "Mclean VA";
		
		
	}
	

}
