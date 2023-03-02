package pl.zalewski.model;

import pl.zalewski.interfaces.DisplayData;
import pl.zalewski.interfaces.Observer;
import pl.zalewski.interfaces.Subject;

public class StatisticsTemperatureDisplay implements Observer, DisplayData {

    private float minTemperature;
    private float avgTemperature;
    private float maxTemperature;
    private float sumTemperature;
    private WeatherData weatherData;
    private int measurementCount;



    public StatisticsTemperatureDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.attach(this);
    }


    @Override
    public void update() {

        measurementCount++;
        if (measurementCount > 1) {
            minTemperature = Math.min(minTemperature, weatherData.getTemperature());
            avgTemperature = avgTemp();
            maxTemperature = Math.max(maxTemperature, weatherData.getTemperature());
        } else {
            minTemperature = weatherData.getTemperature();
            avgTemperature = weatherData.getTemperature();
            maxTemperature = weatherData.getTemperature();
            sumTemperature = weatherData.getTemperature();
        }
        display();
    }

    private float avgTemp() {
        sumTemperature += weatherData.getTemperature();
        avgTemperature = sumTemperature / measurementCount;
        return avgTemperature;
    }


    @Override
    public void display() {
        System.out.printf("""
                        
                        Statistics
                        ==========
                        Minimum temperature: %.1fC degrees
                        Average temperature: %.1fC degrees
                        Maximum temperature: %.1fC degrees
                        """,
                minTemperature, avgTemperature, maxTemperature);
    }

}
