package RefactoringLab;

/**
 * Pricing strategy for children's movies.
 */
public class ChildrensPricingStrategy implements PricingStrategy {
    @Override
    public double calculateCharge(int daysRented) {
        double result = 1.5;
        if (daysRented > 3) {
            result += (daysRented - 3) * 1.5;
        }
        return result;
    }

    @Override
    public int calculateFrequentRenterPoints(int daysRented) {
        return 1;
    }
}