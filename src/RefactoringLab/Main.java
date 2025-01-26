package RefactoringLab;

//import java.util.Arrays;
//import java.util.Collections;
//import java.util.List;
//
///**
// * Demonstrates the application behavior with refactored design.
// */
//public class Main {
//    public static final Movie rosencrantzAndGuildensternAreDead = 
//        new Movie("Rosencrantz and Guildenstern are Dead", new RegularPricingStrategy());
//    public static final Movie citizenKane3D = 
//        new Movie("Citizen Kane 3D", new NewReleasePricingStrategy());
//    public static final Movie anastasia = 
//        new Movie("Anastasia", new ChildrensPricingStrategy());
//
//    public static final Customer gretelFishweaver;
//    public static final List<Customer> customers;
//
//    static {
//        gretelFishweaver = new Customer("Fishweaver, Gretel");
//        gretelFishweaver.addRental(new Rental(rosencrantzAndGuildensternAreDead, 2));
//        gretelFishweaver.addRental(new Rental(citizenKane3D, 3));
//        gretelFishweaver.addRental(new Rental(anastasia, 5));
//
//        customers = Collections.unmodifiableList(Arrays.asList(gretelFishweaver));
//    }
//
//    public static void main(String[] args) {
//        for (Customer customer : customers) {
//            System.out.println(customer.generateStatement());
//            System.out.println("********************************************************************************");
//        }
//    }
//}
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Demonstrates the application behavior with refactored design.
 */
public class Main {
    // Movies with appropriate pricing strategies
    public static final Movie rosencrantzAndGuildensternAreDead = 
        new Movie("Rosencrantz and Guildenstern are Dead", new RegularPricingStrategy());
    public static final Movie suckerpunch = 
        new Movie("Suckerpunch", new RegularPricingStrategy());
    public static final Movie anastasia = 
        new Movie("Anastasia", new ChildrensPricingStrategy());
    public static final Movie braveLittleToaster = 
        new Movie("Brave Little Toaster, The", new ChildrensPricingStrategy());
    public static final Movie citizenKane3D = 
        new Movie("Citizen Kane 3D", new NewReleasePricingStrategy());
    public static final Movie riverTamBeatsUpEveryone = 
        new Movie("River Tam Beats Up Everyone", new NewReleasePricingStrategy());
    public static final Movie sneakers = 
        new Movie("Sneakers", new RegularPricingStrategy()); // Default strategy for no specific case

    // Customers
    public static final Customer gretelFishweaver;
    public static final Customer danielleDeBarbarac;
    public static final Customer richardCarlisle;
    public static final Customer murrayHewitt;
    public static final List<Customer> customers;

    static {
        // Rentals for Gretel Fishweaver
        gretelFishweaver = new Customer("Fishweaver, Gretel");
        gretelFishweaver.addRental(new Rental(rosencrantzAndGuildensternAreDead, 2));
        gretelFishweaver.addRental(new Rental(suckerpunch, 2));
        gretelFishweaver.addRental(new Rental(anastasia, 1));
        gretelFishweaver.addRental(new Rental(braveLittleToaster, 5));
        gretelFishweaver.addRental(new Rental(citizenKane3D, 1));
        gretelFishweaver.addRental(new Rental(riverTamBeatsUpEveryone, 3));

        // Rentals for Danielle de Barbarac
        danielleDeBarbarac = new Customer("de Barbarac, Danielle");
        danielleDeBarbarac.addRental(new Rental(anastasia, 2));
        danielleDeBarbarac.addRental(new Rental(anastasia, 2));
        danielleDeBarbarac.addRental(new Rental(anastasia, 2));

        // Rentals for Sir Richard Carlisle
        richardCarlisle = new Customer("Carlisle, Sir Richard");
        richardCarlisle.addRental(new Rental(citizenKane3D, 10));

        // Rentals for Murray Hewitt
        murrayHewitt = new Customer("Hewitt, Murray");
        murrayHewitt.addRental(new Rental(sneakers, 947));

        // List of all customers
        customers = Collections.unmodifiableList(Arrays.asList(
            gretelFishweaver,
            danielleDeBarbarac,
            richardCarlisle,
            murrayHewitt
        ));
    }

    public static void main(String[] args) {
        for (Customer customer : customers) {
            System.out.println(customer.generateStatement());
            System.out.println("********************************************************************************");
        }
    }
}

