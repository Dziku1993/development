package pl.zalewski.interfaces;

public interface Subject {
    void attach(Observer observer);
    void detach(Observer observer);
    void sendNotify();
}
