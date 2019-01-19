package day51_abstraction_and_abstract_classes;

public abstract class File {
	
	private String name;
	public static int count;
	
	public File() {
		System.out.println("File Class Constructor");
		name = "unknown";
		count++;
	}
	
	public File(String name) {
		System.out.println("File class 1-arg constructor");
		this.name = name;
		count++;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public abstract void open();
	
	public void close() {
		System.out.println("Closing the file.");
	}
}