package pl.zalewski.ingredients;

import pl.zalewski.models.Drink;
import pl.zalewski.models.IngredientDecorator;

public class Chocolate extends IngredientDecorator {

    Drink drink;

    public Chocolate(Drink drink) {
        this.drink = drink;
    }

    @Override
    public String getDescription() {
        return drink.getDescription() + ", chocolate";
    }

    @Override
    public double getPrice() {
        return drink.getPrice() + 0.20d;
    }
}
