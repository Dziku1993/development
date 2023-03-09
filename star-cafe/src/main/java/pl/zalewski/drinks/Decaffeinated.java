package pl.zalewski.drinks;

import pl.zalewski.models.Drink;

public class Decaffeinated extends Drink {

    public Decaffeinated() {
        description = "Decaffeinated coffee";
    }

    @Override
    public double price() {
        return 2.19d;
    }
}
