package pl.zalewski.app;

import pl.zalewski.drinks.Decaffeinated;
import pl.zalewski.drinks.Espresso;
import pl.zalewski.ingredients.Chocolate;
import pl.zalewski.ingredients.WhippedCreme;
import pl.zalewski.models.Drink;

public class Application {
    public static void main(String[] args) {

        Drink coffee = new Decaffeinated();
        System.out.println(coffee.getDescription() + "\n" + coffee.getPrice());

        Drink drink = new Espresso();
        drink = new Chocolate(drink);
        drink = new Chocolate(drink);
        drink = new WhippedCreme(drink);
        System.out.println(drink.getDescription() + "\n" + drink.getPrice());

    }
}
