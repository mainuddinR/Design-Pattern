package AbstractFactoryMethod_L02_Q1;

public class VictorianFurnitureFactory implements FurnitureFactory{
	@Override
	public Chair createChair() {
		
		return new VictorianChair() ;
	}
	@Override
	public Table createTable() {
		return new VictorianTable() ;
	}
	@Override
	public Sofa createSofa() {
		return new VictorianSofa();
	}
}
