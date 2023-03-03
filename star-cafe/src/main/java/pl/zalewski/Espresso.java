package pl.zalewski;

public class Espresso extends Drink {

    public Espresso() {
        description = "Espresso Coffee";
    }

    @Override
    public double price() {
        return 1.99;
    }
}
