package pl.zalewski.duck.interfaces.fly;

public class FlyWithRocketPropulsion implements Flyable {
    @Override
    public void fly() {
        System.out.println("I'm flying with rocket propulsion. ");
    }
}
