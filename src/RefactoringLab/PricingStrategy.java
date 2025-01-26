package RefactoringLab;

/**
 * Strategy interface for calculating rental charges and frequent renter points.
 */
public interface PricingStrategy {
    double calculateCharge(int daysRented);

    int calculateFrequentRenterPoints(int daysRented);
}
