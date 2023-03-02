package pl.zalewski.application;

import pl.zalewski.model.*;

public class App {
    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();
        CurrentWeatherConditionDisplay currentWeather = new CurrentWeatherConditionDisplay(weatherData);
        StatisticsTemperatureDisplay statisticsTemperatureDisplay = new StatisticsTemperatureDisplay(weatherData);
        WeatherForecastDisplay weatherForecast = new WeatherForecastDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

        weatherData.setData(26.4F, 65, 1013.1F);
        weatherData.setData(27.7F, 70, 997.0F);
        weatherData.setData(11.8F, 10, 1020F);

    }
}
