package AbstractFactoryMethod;

public class WebDeveloper implements Employee {
	@Override
	public int Salary() {
		return 55000;
	}
	
	@Override
	public String name() {
		
		return "I am Web Developer";
	}
}
