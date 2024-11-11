package BuilderL06;

import java.awt.Menu;

public class SandwichDirector {

    private Sandwich.SandwichBuilder builder;

    public SandwichDirector(Sandwich.SandwichBuilder builder) {
        this.builder = builder;
    }

    public Sandwich constructChickenSandwich() {
        return builder
            .setBread("Regular Bread")
            .setFilling("Grilled Chicken")
            .setAccompaniment("Cheese")
            .build();
    }

    public Sandwich constructEggSandwich() {
        return builder
            .setBread("Toasted Bread")
            .setFilling("Fried Egg")
            .setAccompaniment("Sauce")
            .build();
    }

    public Sandwich constructCustomSandwich(String bread, String filling, String accompaniment) {
        return builder
            .setBread(bread)
            .setFilling(filling)
            .setAccompaniment(accompaniment)
            .build();
    }
   
}

