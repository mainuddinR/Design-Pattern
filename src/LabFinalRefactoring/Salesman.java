package LabFinalRefactoring;

class Salesman extends Employee {
    private double commission;

    public Salesman(double salary, double commission) {
        super(salary);
        this.commission = commission;
    }

    @Override
    public double payAmount() {
        return monthlySalary + commission;
    }
}