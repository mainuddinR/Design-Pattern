package LabFinalRefactoring;

class EmployeeFactory {
    public static Employee createEmployee(String type, double salary, double commission, double bonus) {
        switch (type.toLowerCase()) {
            case "engineer":
                return new Engineer(salary);
            case "salesman":
                return new Salesman(salary, commission);
            case "manager":
                return new Manager(salary, bonus);
            default:
                throw new IllegalArgumentException("Invalid Employee Type");
        }
    }
}