package Singleton_L02_Part2;

import java.util.concurrent.atomic.AtomicInteger;

import AbstractFactoryMethod_L02_Q1.ModernFurnitureFactory;

public class MudernFurnitureFactory implements FurnitureFactory{
	private static MudernFurnitureFactory instance;
	private AtomicInteger idGenerator= new AtomicInteger(1);//unique id ensure
	
	private MudernFurnitureFactory() {
		
	}
	public static MudernFurnitureFactory getInstance() {
		if(instance==null) {
			synchronized (ModernFurnitureFactory.class) {
				if(instance==null) {
					instance= new MudernFurnitureFactory();
				}
			}
		}
		return instance;
	}
	
	@Override
	public Chair createChair() {
		return new ModernChair(idGenerator.getAndIncrement());
	}
	@Override
	public Table createTable() {
		return new ModernTable(idGenerator.getAndIncrement());
	}
	@Override
	public Sofa createSofa() {
		return new ModernSofa(idGenerator.getAndIncrement());
	}
}
