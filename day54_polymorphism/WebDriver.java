package day54_polymorphism;

public interface WebDriver {
	
	void navigate(String url);
	void open();
	void close();
	default void quit() {
		
		System.out.println("default quit method, sub class override it or use it as is");
		
	}

}
