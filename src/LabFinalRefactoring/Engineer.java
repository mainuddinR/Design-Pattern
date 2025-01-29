package LabFinalRefactoring;

class Engineer extends Employee {
    public Engineer(double salary) {
        super(salary);
    }

    @Override
    public double payAmount() {
        return monthlySalary;
    }
}