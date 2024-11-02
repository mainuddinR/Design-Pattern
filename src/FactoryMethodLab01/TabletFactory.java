package FactoryMethodLab01;

public class TabletFactory extends DeviceFactory {
 private double screenSize;
 private int storage;

 public TabletFactory(double screenSize, int storage) {
     this.screenSize = screenSize;
     this.storage = storage;
 }

 @Override
 public Device createDevice() {
     return new Tablet(screenSize, storage);
 }
}

