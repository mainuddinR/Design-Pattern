package AbstractFactoryMethod;

public class Manager implements Employee{
	
	@Override
	public int Salary() {
		return 65000;
	}
	@Override
	public String name() {
		return "My post is Manager";
	}

}
