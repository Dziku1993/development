package pl.zalewski.model;

import pl.zalewski.interfaces.DisplayData;
import pl.zalewski.interfaces.Observer;

public class WeatherForecast implements DisplayData, Observer {

    private static final String SPRING = "Everything is waking up to living";
    private static final String SUMMER = "Enjoy beautiful weather";
    private static final String AUTUMN = "Winter is coming";
    private static final String WINTER = "Stay at home, it is going to be very cold";

    private String forecast;
    WeatherData weatherData;

    public WeatherForecast(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.attach(this);
    }

    @Override
    public void update() {
        if (weatherData.getTemperature() < 15.5) {
            forecast = WINTER;
        } else if (weatherData.getTemperature() < 26.5) {
            forecast = SPRING;
        } else {
            forecast = SUMMER;
        }
        display();
    }

    @Override
    public void display() {
        System.out.printf("""
                
                Weather forecast
                ================
                %s
                """,
                forecast);
    }
}
