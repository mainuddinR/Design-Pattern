package DecoratorLab09_1;

class BasicCoffee implements Coffee {
    @Override
    public String getDescription() {
        return "Basic Coffee";
    }

    @Override
    public double getCost() {
        return 2.0; // Base price of the coffee
    }
}
