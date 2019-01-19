package day43_static;

public class TV {
	private int channel =1;
	private int volumeLevel=1;
	private boolean on = false;
	private String brand = "undefined";
	
	public TV() {
		System.out.println("Creating TV object using no Args constructor");
	}
	//overload the constructor
	
	public TV(String brand) {
		System.out.println("Creating TV object using 1 Args construnctor");
			this.brand= brand;
		
		}
	
	
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		if(on && channel > 0 && channel < 121) {
		     this.channel = channel;
		}else {
			System.out.println("ERROR: TV is either OFF or invalid Channel");
		}
	}
	
	public int getVolumeLevel() {
		return volumeLevel;
	}
	public void setVolumeLevel(int volumeLevel) {
		if(on == true && volumeLevel >= 1 && volumeLevel <= 7) {
			this.volumeLevel = volumeLevel;
		}else {
			System.out.println("ERROR: TV is either OFF or invalid Volume level");			
		}
	}
	public boolean isOn() {
		return on;
	}
	
	public void turnOn() {
		if(isOn()  ) {
			System.out.println("TV is already ON");
		}else {
			on = true;
			//this.on = true;
		}
	}
	
	public void turnOff() {
		if(isOn()) {
			on = false;
		}else {
			System.out.println("TV is already OFF");
		}
	}
	
	public void channelUp() {
		if(isOn() && channel < 120) {
			channel++;
		}
	}
	
	public void channelDown() {
		if(isOn() && channel > 1) {
			channel--;
		}
	}
	
	public void volumeUp() {
		if(isOn() && volumeLevel < 7) {
			volumeLevel++;
		}
	}
	
	public void volumeDown() {
		if(isOn() && volumeLevel > 1) {
			volumeLevel--;
		}
	}
	
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}

}
