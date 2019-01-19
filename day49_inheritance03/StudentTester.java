package day49_inheritance03;

public class StudentTester {
	public static void main(String[]args) {
		
		Student student = new Student() ;
		OnlineStudent onlineStudent= new OnlineStudent();
		OnCampusStudent onCampusStudent= new OnCampusStudent();
		
		student.attendAClass();
		onlineStudent.attendAClass();
		onCampusStudent.attendAClass();
		
		
		
		
			
		}
	}


