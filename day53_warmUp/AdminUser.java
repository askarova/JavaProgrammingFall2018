package day53_warmUp;

public class AdminUser extends SlackUser{
	  boolean isOwner;
	  
	  public AdminUser(int age, String name,boolean isOwner) {
			super(age,name);
			this.isOwner= isOwner;	
		}
	 
	 
	 public void activateUser(String name) {
		 System.out.println("Admin user activating a user");
		 
	 }
	 public void deActivate(String name) {
		 System.out.println("Admin user DeActivating a user");
	 }
	  
	 @Override
		public void sendMessage(String message) {
			System.out.println("Admin user send message "+ message);
		}
		
	}
