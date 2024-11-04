package FacadeL04_Q2;

public class PizzaOrderFacade {
    private AccountService accountService;
    private SecurityService securityService;
    private PaymentService paymentService;
    private LedgerService ledgerService;
    private NotificationService notificationService;

    public PizzaOrderFacade() {
        this.accountService = new AccountService();
        this.securityService = new SecurityService();
        this.paymentService = new PaymentService();
        this.ledgerService = new LedgerService();
        this.notificationService = new NotificationService();
    }

    // Simplified interface for pizza order and payment processing
    public void orderPizzaWithCreditCard(String cardNumber, String pin, double amount) {
        if (accountService.checkAccount(cardNumber)) {
            if (securityService.validatePIN(cardNumber, pin)) {
                if (paymentService.checkBalance(cardNumber, amount)) {
                    paymentService.makePayment(cardNumber, amount);
                    ledgerService.makeLedgerEntry(cardNumber, amount);
                    notificationService.sendPaymentNotification(cardNumber);
                    System.out.println("Pizza ordered successfully!");
                } else {
                    System.out.println("Insufficient balance.");
                }
            } else {
                System.out.println("Invalid PIN.");
            }
        } else {
            System.out.println("Invalid account.");
        }
    }
}
