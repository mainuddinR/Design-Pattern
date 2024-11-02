package FactoryMethodLab01;

public class Smartphone implements Device {
	
	private String model;
    private int batteryCapacity;

    public Smartphone(String model, int batteryCapacity) {
        this.model = model;
        this.batteryCapacity = batteryCapacity;
    }
	
    @Override
    public void powerOn() {
        System.out.println("Smartphone " + model + " is powering on.");
    }

    @Override
    public void powerOff() {
        System.out.println("Smartphone " + model + " is powering off.");
    }
    
    @Override
    public String getDeviceInfo() {
    	return "Smartphone Model: " + model + ", Battery Capacity: " + batteryCapacity + "mAh";
    }
}