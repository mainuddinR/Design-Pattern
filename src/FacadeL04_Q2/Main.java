package BSSE1472_L04_Q2;

public class Main {
    public static void main(String[] args) {
        PizzaOrderFacade pizzaOrder = new PizzaOrderFacade();
        
        //pin
        
        pizzaOrder.orderPizzaWithCreditCard("1234-5678-9012-3456", "1234", 25.99);
        
        pizzaOrder.orderPizzaWithCreditCard("1234-5678-9012-3456", "5690", 25.99);
        
   
        pizzaOrder.orderPizzaWithCreditCard("1234-5678-9012-3456", "5690", 1200.00);
    }
}
