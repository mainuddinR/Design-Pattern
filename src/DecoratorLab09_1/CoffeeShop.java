package DecoratorLab09_1;

public class CoffeeShop {
    public static void main(String[] args) {
        // Start with a basic coffee
        Coffee coffee = new BasicCoffee();
        System.out.println(coffee.getDescription() + " -> $" + coffee.getCost());

        // Add milk
        coffee = new MilkDecorator(coffee);
        System.out.println(coffee.getDescription() + " -> $" + coffee.getCost());

        // Add sugar
        coffee = new SugarDecorator(coffee);
        System.out.println(coffee.getDescription() + " -> $" + coffee.getCost());

        // Add whipped cream
        coffee = new WhippedCreamDecorator(coffee);
        System.out.println(coffee.getDescription() + " -> $" + coffee.getCost());
        
        Coffee coffee1=new BasicCoffee();
        coffee1=new WhippedCreamDecorator(coffee1);
        System.out.println(coffee1.getDescription() + " -> $" + coffee1.getCost());
        
    }
}