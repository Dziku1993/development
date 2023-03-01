package pl.zalewski.duck.model;

import pl.zalewski.duck.interfaces.fly.FlyingWithWings;
import pl.zalewski.duck.interfaces.voice.QuackVoice;

public class FlyingDuck extends Duck {

    public FlyingDuck() {
        flying = new FlyingWithWings();
        voice = new QuackVoice();
    }

    @Override
    void display() {
        System.out.println("This is flying duck");
    }
}
