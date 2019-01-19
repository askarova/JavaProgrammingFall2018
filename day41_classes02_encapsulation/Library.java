package day41_classes02_encapsulation;

public class Library {
	public static void main(String[]args) {
		Book book1= new Book();
		book1.setTitle("Grit");
		
		System.out.println(book1.getTitle());
		
		book1.setAuthor("Nickolas Smith");
		System.out.println(book1.getAuthor());
		
		book1.setPages(120);
		System.out.println(book1.getPages());
		
		Book javaBook= new Book() ;
			
		javaBook.setTitle("headfirst Java");
		javaBook.setAuthor("Kathy Sierra");
		javaBook.setPages(400);
		
		System.out.println(javaBook.getTitle());
		System.out.println(javaBook.getAuthor());
		System.out.println(javaBook.getPages());
		
	}

}
