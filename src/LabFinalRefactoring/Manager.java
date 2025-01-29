package LabFinalRefactoring;

class Manager extends Employee {
    private double bonus;

    public Manager(double salary, double bonus) {
        super(salary);
        this.bonus = bonus;
    }

    @Override
    public double payAmount() {
        return monthlySalary + bonus;
    }
}
