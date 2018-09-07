package exercise02.designPatterns.observer.weather;

public class CurrentConditionDisplay implements Observer {
    private Subject weatherData;
    private float temperature;
    private float humidity;

    public CurrentConditionDisplay(Subject weatherData)
    {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    public void display()
    {
        System.out.println("Current Conditions: " + temperature + "F degrees and " +
                        humidity + "% humidity ");
    }
}
