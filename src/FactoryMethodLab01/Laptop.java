package FactoryMethodLab01;

public class Laptop implements Device {
	private int ram;
    private String processor;
    
    public Laptop(int ram, String processor) {
    	this.ram=ram;
    	this.processor=processor;
    }
    @Override
    public void powerOn() {
        System.out.println("Laptop with " + ram + "GB RAM and " + processor + " processor is powering on.");
    }

    @Override
    public void powerOff() {
        System.out.println("Laptop with " + ram + "GB RAM and " + processor + " processor is powering off.");
    }
    
    @Override
    public String getDeviceInfo() {
    	return "Laptop RAM: " + ram + "GB, Processor: " + processor;
    }
}
