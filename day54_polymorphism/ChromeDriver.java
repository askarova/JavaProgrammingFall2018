package day54_polymorphism;

public class ChromeDriver implements WebDriver {
	
	public void setChromeOption(String[]options) {
		
		for(String option: options) {
			System.out.println("setting chrome option");
		}
	}

	@Override
	public void navigate(String url) {
		System.out.println("Navigating to " +url + "on chrome");
		
	}

	@Override
	public void open() {
		System.out.println("Opening chrome driver");
		
	}

	@Override
	public void close() {
		System.out.println("Closing chrome driver");
		
	}
	

}
