package day51_abstraction_and_abstract_classes;

public class FileTests {
	public static void main(String[] args) {
		//File file1 = new File(); will not work, cannot create object
		XLSFile xl = new XLSFile();
		xl.open();
		xl.close();
		xl.setName("TestData.xls");
		System.out.println("XLS file name: " + xl.getName());
		
		JPGFile jpg = new JPGFile();
		jpg.setName("Event01.jpg");
		jpg.open();
		jpg.close();
		System.out.println("JPG file name: " + jpg.getName());
		
		System.out.println(File.count);
		System.out.println(JPGFile.count);
		System.out.println(XLSFile.count);
		
		
		
	}
}
