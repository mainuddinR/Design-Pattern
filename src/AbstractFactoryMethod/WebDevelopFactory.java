package AbstractFactoryMethod;


public class WebDevelopFactory extends EmployeeAbstractFactory {
	@Override
	public Employee creatEmployee() {
		
		return new WebDeveloper();
	}
}
