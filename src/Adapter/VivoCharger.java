package Adapter;

public class VivoCharger implements AndroidCharger{
	
	@Override
	public void chargeAndroidPhone() {
		System.out.println("Your android phone is charging");
	}
}
