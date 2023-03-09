package pl.zalewski.models;

abstract public class Drink {
    protected String description;

    public String getDescription() {
        return description;
    }

    public abstract double getPrice();
}
