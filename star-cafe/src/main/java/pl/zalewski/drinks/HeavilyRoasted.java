package pl.zalewski.drinks;

import pl.zalewski.models.Drink;

public class HeavilyRoasted extends Drink {

    public HeavilyRoasted() {
        description = "Heavily roasted coffee";
    }

    @Override
    public double getPrice() {
        return 1.19d;
    }
}
