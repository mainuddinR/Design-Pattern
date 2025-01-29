package LabFinalRefactoring;

abstract class Employee {
    protected double monthlySalary;

    public Employee(double salary) {
        this.monthlySalary = salary;
    }

    public abstract double payAmount();
}
