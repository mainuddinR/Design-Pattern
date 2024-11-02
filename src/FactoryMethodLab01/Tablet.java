package FactoryMethodLab01;

public class Tablet implements Device {
	private double screenSize;
    private int storage;

    public Tablet(double screenSize, int storage) {
    	this.screenSize=screenSize;
    	this.storage=storage;
    }
    
    @Override
    public void powerOn() {
        System.out.println("Tablet with "+screenSize+ "-inch screen is powering on.");
    }

    @Override
    public void powerOff() {
        System.out.println("Tablet with "+screenSize+ "-inch screen is powering off.");
    }
    
    @Override
    public String getDeviceInfo() {   	
    	return "Tablet Screen Size: "+screenSize+" inches, Strorage: "+storage+"GB";
    }
}
