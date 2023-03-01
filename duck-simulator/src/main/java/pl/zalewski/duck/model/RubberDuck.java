package pl.zalewski.duck.model;

import pl.zalewski.duck.interfaces.voice.BeepVoice;
import pl.zalewski.duck.interfaces.fly.CantFlying;

public class RubberDuck extends Duck {

    public RubberDuck() {
        flying = new CantFlying();
        voice = new BeepVoice();
    }

    @Override
    void display() {
        System.out.println("This is rubber duck");
    }
}
