package pl.zalewski.ingredients;

import pl.zalewski.models.Drink;
import pl.zalewski.models.IngredientDecorator;

public class WhippedCreme extends IngredientDecorator {

    Drink drink;

    public WhippedCreme(Drink drink) {
        this.drink = drink;
    }

    @Override
    public String getDescription() {
        return drink.getDescription() + ", whipped creme";
    }

    @Override
    public double getPrice() {
        return drink.getPrice() + 0.3d;
    }
}
