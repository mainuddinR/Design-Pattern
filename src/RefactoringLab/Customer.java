package RefactoringLab;

import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;

/**
 * Represents a customer and their rental transactions.
 * Simplified by delegating rental calculations to Rental and PricingStrategy.
 */
public class Customer {
    private String name;
    private List<Rental> rentals = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addRental(Rental rental) {
        this.rentals.add(rental);
    }

    public String generateStatement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        Formatter formatter = new Formatter();
        formatter.format("Rental Record for %s\n", getName());

        for (Rental rental : rentals) {
            double rentalCharge = rental.getCharge();
            frequentRenterPoints += rental.getFrequentRenterPoints();

            formatter.format("    %-40s  (%02d)  $%5.2f\n", rental.getMovie().getTitle(), rental.getDaysRented(), rentalCharge);
            totalAmount += rentalCharge;
        }

        formatter.format("Amount owed is $%5.2f\n", totalAmount);
        formatter.format("You earned %d frequent renter points", frequentRenterPoints);

        String result = formatter.toString();
        formatter.close();
        return result;
    }
}
