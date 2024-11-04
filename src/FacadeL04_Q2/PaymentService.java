package FacadeL04_Q2;

public class PaymentService {
    public boolean checkBalance(String cardNumber, double amount) {
        System.out.println("Checking balance for card: " + cardNumber);
        return amount <= 1000;
    }

    public void makePayment(String cardNumber, double amount) {
        System.out.println("Making payment of $" + amount + " for card: " + cardNumber);
    }
}

