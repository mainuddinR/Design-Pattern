package FacadeL04_Q2;

public class Main {
    public static void main(String[] args) {
        PizzaOrderFacade pizzaOrder = new PizzaOrderFacade();
        
        //pin
        
        pizzaOrder.orderPizzaWithCreditCard("1234-5677-7656", "1234", 25.99);
        
        pizzaOrder.orderPizzaWithCreditCard("1234-5678-9012", "5690", 25.99);
        
   
        pizzaOrder.orderPizzaWithCreditCard("1234-5678-9012", "5690", 1200.00);
    }
}
