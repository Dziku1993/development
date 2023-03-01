package pl.zalewski.duck.interfaces.fly;

public class FlyingWithWings implements Flyable {

    @Override
    public void fly() {
        System.out.println("I'm flying on my wings");
    }
}
