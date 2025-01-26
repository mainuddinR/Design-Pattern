package RefactoringLab;

/**
 * Pricing strategy for new release movies.
 */
public class NewReleasePricingStrategy implements PricingStrategy {
    @Override
    public double calculateCharge(int daysRented) {
        return daysRented * 3;
    }

    @Override
    public int calculateFrequentRenterPoints(int daysRented) {
        return (daysRented > 1) ? 2 : 1;
    }
}
