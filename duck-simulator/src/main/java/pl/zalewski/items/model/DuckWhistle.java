package pl.zalewski.items.model;

import pl.zalewski.duck.interfaces.voice.QuackVoice;

public class DuckWhistle extends Whistle {

    public DuckWhistle() {
        voice = new QuackVoice();
    }

    @Override
    public void display() {
        System.out.println("This is a duck whistle");
    }
}
