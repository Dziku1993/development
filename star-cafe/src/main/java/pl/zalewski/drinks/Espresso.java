package pl.zalewski.drinks;

import pl.zalewski.models.Drink;

public class Espresso extends Drink {

    public Espresso() {
        description = "Espresso Coffee";
    }

    @Override
    public double getPrice() {
        return 1.99;
    }
}
