package RefactoringLab;

/**
 * Represents a movie with a title and a price code.
 * Refactored to delegate price-specific behavior to a PricingStrategy.
 */
public class Movie {
    private String title;
    private PricingStrategy pricingStrategy;

    public Movie(String title, PricingStrategy pricingStrategy) {
        this.title = title;
        this.pricingStrategy = pricingStrategy;
    }

    public String getTitle() {
        return title;
    }

    public double calculateCharge(int daysRented) {
        return pricingStrategy.calculateCharge(daysRented);
    }

    public int calculateFrequentRenterPoints(int daysRented) {
        return pricingStrategy.calculateFrequentRenterPoints(daysRented);
    }
}
