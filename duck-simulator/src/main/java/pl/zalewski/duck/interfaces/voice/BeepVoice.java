package pl.zalewski.duck.interfaces.voice;

public class BeepVoice implements Voiceable {

    @Override
    public void makeVoice() {
        System.out.println("Beep, beep.");
    }
}
