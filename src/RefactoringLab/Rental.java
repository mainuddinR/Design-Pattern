package RefactoringLab;

/**
 * Represents a rental with its associated movie and rental duration.
 */
public class Rental {
    private Movie movie;
    private int daysRented;

    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    public Movie getMovie() {
        return movie;
    }

    public int getDaysRented() {
        return daysRented;
    }

    public double getCharge() {
        return movie.calculateCharge(daysRented);
    }

    public int getFrequentRenterPoints() {
        return movie.calculateFrequentRenterPoints(daysRented);
    }
}

