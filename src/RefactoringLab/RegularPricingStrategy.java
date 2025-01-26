package RefactoringLab;

/**
 * Pricing strategy for regular movies.
 */
public class RegularPricingStrategy implements PricingStrategy {
    @Override
    public double calculateCharge(int daysRented) {
        double result = 2;
        if (daysRented > 2) {
            result += (daysRented - 2) * 1.5;
        }
        return result;
    }

    @Override
    public int calculateFrequentRenterPoints(int daysRented) {
        return 1;
    }
}
