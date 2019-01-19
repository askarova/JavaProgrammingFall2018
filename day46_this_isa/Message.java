package day46_this_isa;

/**
 * template class for Messages
 * @author cybertekschool
 *
 */
public class Message {

	private String body;
	private String sender;
	private String receiver;
	

	
	public String toString() {
		return "Message [body=" + body + ", sender=" + sender + ", receiver=" + receiver + "]";
	}

	public Message(String body, String sender, String receiver) {
		this.body = body;
		this.sender = sender;
		this.receiver = receiver;
	}
	
	//overload the constructor
	public Message(String body) {
		this(body, "Unknown", "Unknown");
	
		System.out.println("1 arg constructor");
		
	}
	
	//overload the constructor
	public Message(String body, String receiver) {
		this(body, "Unknown", receiver);
		System.out.println("2 Args constructor");
	}
	
	public Message() {
		this("","Unknown", "Unknown");
	}
	
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
	
		this.body = body;
	}
	public String getSender() {
		return sender;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}
	public String getReceiver() {
		return receiver;
	}
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}
	
	
	
}
