package day49_inheritance03;

public class Google extends SearchEngine{

	@Override
	public void search(String item) {
		System.out.println("Navigate to google.com and search for " +item);
	}
	

}
