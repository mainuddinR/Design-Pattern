package AbstractFactoryMethod_L02_Q1;

public class ModernFurnitureFactory implements FurnitureFactory{
	@Override
	public Chair createChair() {
		return new ModernChair();
	}
	@Override
	public Table createTable() {
		return new ModernTable();
	}
	@Override
	public Sofa createSofa() {
		return new ModernSofa();
	}
}
