package pl.zalewski.duck.interfaces.fly;

public class CantFlying implements Flyable {
    @Override
    public void fly() {
        System.out.println("I can't Fly");
    }
}
