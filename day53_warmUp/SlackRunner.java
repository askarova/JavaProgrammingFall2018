package day53_warmUp;

public class SlackRunner {

	public static void main(String[] args) {
		
		RegularUser u1 = new RegularUser(23, "John", 6);
		u1.sendMessage("Hello World");
		u1.joinGroup(43);
		
		
		AdminUser u2 = new AdminUser(30, "Akbar", true);
		u2.sendMessage("Hello Student");
        u2.activateUser("john");
        

	}

}
