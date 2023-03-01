package pl.zalewski.model;

import pl.zalewski.interfaces.DisplayData;
import pl.zalewski.interfaces.Observer;
import pl.zalewski.interfaces.Subject;

public class CurrentWeatherConditionDisplay implements Observer, DisplayData {

    private float temperature;
    private float humidity;
    private float pressure;
    private WeatherData weatherData;

    public CurrentWeatherConditionDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.attach(this);
    }

    @Override
    public void update() {
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        this.pressure = weatherData.getPressure();
        display();
    }

    @Override
    public void display() {
        System.out.printf("""
               
                Current weather:
                =================
                Temperature: %.1fC degrees
                Humidity: %.1f%%
                Pressure: %.2fhpa
                """,
                temperature, humidity, pressure);
    }
}
