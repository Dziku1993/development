package pl.zalewski.duck.model;

import pl.zalewski.duck.interfaces.fly.Flyable;
import pl.zalewski.duck.interfaces.voice.Voiceable;

public abstract class Duck {
    protected Flyable flying;
    protected Voiceable voice;

    public void setFlying(Flyable flying) {
        this.flying = flying;
    }

    public void setVoice(Voiceable voice) {
        this.voice = voice;
    }

    public void swim() {
        System.out.println("All ducks can swim");
    }

    public void fly() {
        flying.fly();
    }

    public void makeVoice() {
        voice.makeVoice();
    }

    abstract void display();
}
