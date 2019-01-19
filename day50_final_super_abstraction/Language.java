package day50_final_super_abstraction;

public class Language {
	
	public String name = "General Language";
	
	public static void staticMethod() {
		System.out.println("Language - static method");
		
	}

	public void printNamme() {
		System.out.println("Language: " + name);
		staticMethod();
		
	}
}
