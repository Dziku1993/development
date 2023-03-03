package pl.zalewski;

abstract public class Drink {
    protected String description;

    public String getDescription() {
        return description;
    }

    abstract double price();
}
