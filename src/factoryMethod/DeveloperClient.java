package factoryMethod;

public class DeveloperClient {
	public static void main(String[] args) {
 
		Employee employee=EmployeeFactory.getEmployee("android developer");
		int salary=employee.Salary();
		System.out.println("Salay:"+salary);
		
		Employee employee2;
		employee2=EmployeeFactory.getEmployee("web developer");
		int salaryW=employee2.Salary();
		System.out.println("Salary:"+salaryW);
		
		employee2=EmployeeFactory.getEmployee("ANDROID DEVELOPER");
		int salary1=employee.Salary();
		System.out.println("Salay1:"+salary);
				
	}
}
