package exercise02.designPatterns.observer.observableWeather;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionDisplay implements DisplayElement, Observer {
    private Observable observable;
    private float temperature;
    private float humidity;

    CurrentConditionDisplay(Observable o){
        this.observable = o;
        o.addObserver(this);
    }

    @Override
    public void update(Observable obs, Object arg) {
        if (obs instanceof WeatherData)
        {
            WeatherData weatherData = (WeatherData)obs;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Current Conditions: " + temperature
                + "F degrees and " + humidity + "% humidity");
    }
}
