package day59_exceptions;

public class UserManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//CreateUserName("6 Ibrahim CyberTek");
		CreateUserName("Ib HASHDASHDGASJHDGA");
		String str = null ; 
		CreateUserName(str);

	}
	
	public  static void CreateUserName(String name) {
	
		try {
			System.out.println(name.charAt(0));
			System.out.println(name.charAt(3));
			
			char[] nameChars = name.toCharArray();
			System.out.println(nameChars[9]);
			
			String[] arrName=name.split("");
			Integer i = Integer.parseInt(arrName[0]);
			System.out.println(i);
			
			throw new Exception();
			
		}catch(NullPointerException e) {
			System.out.println("caught NullPointerException ");
		}catch(StringIndexOutOfBoundsException e) {
			System.out.println("caught StringIndexOutOfBoundsException ");
		}catch(NumberFormatException e) {
			System.out.println("caught NumberFormatException ");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("caught ArrayIndexOutOfBoundsException ");  
		
		}catch(Exception e) {
			System.out.println("caught Exception ");  
		
		}finally {
			System.out.println(" this is finally block");
		}
	}

}