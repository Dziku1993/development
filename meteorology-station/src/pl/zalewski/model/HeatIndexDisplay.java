package pl.zalewski.model;

import pl.zalewski.interfaces.DisplayData;
import pl.zalewski.interfaces.Observer;

public class HeatIndexDisplay implements DisplayData, Observer {

    WeatherData weatherData;
    float index;
    float temperature;
    float humidity;

    public HeatIndexDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.attach(this);
    }

    @Override
    public void update() {
        temperature = weatherData.getTemperature();
        humidity = weatherData.getHumidity();
        index = calculateHeatIndex(temperature, humidity);
        display();
    }

    @Override
    public void display() {
        System.out.printf("""
                
                Calculated heat index has value %s
                """,
                index);
    }

    private float calculateHeatIndex(float t, float rh) {
        float index = (float)((16.923 + (0.185212 * temperature) + (5.37941 * humidity) - (0.100254 * temperature * humidity)
                + (0.00941695 * (temperature * temperature)) + (0.00728898 * (humidity * humidity))
                + (0.000345372 * (temperature * temperature * humidity)) - (0.000814971 * (temperature * humidity * humidity)) +
                (0.0000102102 * (temperature * temperature * humidity * humidity)) - (0.000038646 * (temperature * temperature * temperature)) + (0.0000291583 *
                (humidity * humidity * humidity)) + (0.00000142721 * (temperature * temperature * temperature * humidity)) +
                (0.000000197483 * (temperature * humidity * humidity * humidity)) - (0.0000000218429 * (temperature * temperature * temperature * humidity * humidity)) +
                0.000000000843296 * (temperature * temperature * humidity * humidity * humidity)) -
                (0.0000000000481975 * (temperature * temperature * temperature * humidity * humidity * humidity)));
        return index;
    }
}
