package day51_abstraction_and_abstract_classes;

public class PDFFile extends File{
	
	//How do I call File(String name)
	//super()
	public PDFFile(String name) {
		super(name);
	}
	
	
	@Override
	public void open() {
		System.out.println("Opening PDF File using Adobe Acrobat Reader");
	}
}
