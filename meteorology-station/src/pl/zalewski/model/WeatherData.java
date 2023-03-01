package pl.zalewski.model;

import pl.zalewski.interfaces.Observer;
import pl.zalewski.interfaces.Subject;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {

    private List<Observer> observerList;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        this.observerList = new ArrayList<>();
    }

    public List<Observer> getObserverList() {
        return observerList;
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    @Override
    public void attach(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        int index = observerList.indexOf(observer);
        if (index >= 0) {
            observerList.remove(index);
        }
    }

    public void sendNotify() {
        //TODO implement notify
        for (Observer observerToUpdate : observerList) {
            observerToUpdate.update();
        }
    }

    public void changeData() {
        sendNotify();
    }

    //Test method changing data
    public void setData(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        changeData();
    }
}
