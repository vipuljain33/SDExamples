package designPatterns.observer.custom;

public class CurrentConditionDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private float pressure;
    private Subject weatherData;

    public CurrentConditionDisplay(WeatherData wd)
    {
        this.weatherData = wd;
        wd.registerObserver(this);

    }
    @Override
    public void display() {

        System.out.println("Current Conditions: "+ temperature + "F degrees and "+ humidity + "% humidity");

    }

    @Override
    public void update(float temperature, float humidity, float pressure) {

        this.temperature = temperature;
        this.humidity = humidity;
        display();

    }
}
