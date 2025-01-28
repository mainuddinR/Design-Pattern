package DecoratorLab09_1;

abstract class CoffeeDecorator implements Coffee {
    protected Coffee coffee; // The coffee object being wrapped

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription();
    }

    @Override
    public double getCost() {
        return coffee.getCost();
    }
}
