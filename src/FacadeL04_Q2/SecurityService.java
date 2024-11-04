package FacadeL04_Q2;

public class SecurityService {
    public boolean validatePIN(String cardNumber, String pin) {
        System.out.println("Validating PIN for card: " + cardNumber);
        return pin.equals("5690");
    }
}

