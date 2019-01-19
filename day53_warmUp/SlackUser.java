package day53_warmUp;

public abstract class SlackUser {
	
	int age;
	String name;
	
  public SlackUser(int age, String name) {
	  
	  this.age = age;
	  this.name = name;
  }
  
  
  public abstract void sendMessage(String message);
  
}

