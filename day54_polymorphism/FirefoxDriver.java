package day54_polymorphism;

public class FirefoxDriver implements WebDriver {

public void setChromeOption(String[]options) {
		
		for(String option: options) {
			System.out.println("setting firefox option");
		}
	}
		
	

	@Override
	public void navigate(String url) {
		System.out.println("Navigating to " +url + "on firefox");
		
	}

	@Override
	public void open() {
		System.out.println("Opening firefox driver");
		
	}

	@Override
	public void close() {
		System.out.println("Closing firefox driver");
		
	}
	

}
