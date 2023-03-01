package pl.zalewski.items.model;

import pl.zalewski.duck.interfaces.voice.Voiceable;

public abstract class Whistle {
    Voiceable voice;

    public void whistle() {
        voice.makeVoice();
    }

    public void display() {
        System.out.println("This is whistle");
    }
}
