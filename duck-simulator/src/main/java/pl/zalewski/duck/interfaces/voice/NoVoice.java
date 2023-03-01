package pl.zalewski.duck.interfaces.voice;

public class NoVoice implements Voiceable {

    @Override
    public void makeVoice() {
        System.out.println("Silence...");
    }
}
