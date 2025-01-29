package LabFinalRefactoring;

class TestEmployee {
    public static void main(String[] args) {
  
        Employee manager = EmployeeFactory.createEmployee("manager", 20000, 0, 2500);
        System.out.println("Manager Pay: " + manager.payAmount());

        Employee salesman = EmployeeFactory.createEmployee("salesman", 10000, 1500, 0);
        System.out.println("Salesman Pay: " + salesman.payAmount());

        Employee engineer = EmployeeFactory.createEmployee("engineer", 15000, 0, 0);
        System.out.println("Engineer Pay: " + engineer.payAmount());
    }
}