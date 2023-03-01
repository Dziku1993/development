package pl.zalewski.duck.interfaces.voice;

public class QuackVoice implements Voiceable {
    @Override
    public void makeVoice() {
        System.out.println("Quack, quack");
    }
}
