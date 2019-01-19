package day41_classes02_encapsulation;

public class Book {
	
	private String title;
	private String author;
	private int pages;
	
	public String getTitle() {
		return title;
		
	}
	public void setTitle(String newTitle) {
		title= newTitle;
		
	}

	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String newAuthor) {
		author= newAuthor;
	}
	
	public int getPages() {
		return pages;
	}
	public void setPages(int newPages) {
		pages=newPages;
	}
	
}
