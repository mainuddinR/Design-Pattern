package factoryMethod;

public class EmployeeFactory {
	//get the employee
	public static Employee getEmployee(String empType) {
		if(empType.trim().equalsIgnoreCase("ANDROID DEVELOPER")) {//age piche space delected jonno trim use
			return new androidDeveloper();
		}
		else if(empType.trim().equalsIgnoreCase("WEB DEVELOPER")) {
			return new webDeveloper();
		}
		else {
			return null;
		}
	}
}
