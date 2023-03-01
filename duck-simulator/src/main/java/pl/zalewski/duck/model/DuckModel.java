package pl.zalewski.duck.model;

import pl.zalewski.duck.interfaces.fly.CantFlying;
import pl.zalewski.duck.interfaces.voice.NoVoice;

public class DuckModel extends Duck {

    public DuckModel() {
        flying = new CantFlying();
        voice = new NoVoice();
    }

    @Override
    void display() {
        System.out.println("This is duck model");
    }
}
