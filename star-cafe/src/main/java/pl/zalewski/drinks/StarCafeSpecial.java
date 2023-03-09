package pl.zalewski.drinks;

import pl.zalewski.models.Drink;

public class StarCafeSpecial extends Drink {

    public StarCafeSpecial() {
        description = "Star Cafe Special";
    }

    @Override
    public double getPrice() {
        return 0.89d;
    }
}
