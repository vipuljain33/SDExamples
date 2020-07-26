package designPatterns.observer.custom;

public class ForecastDisplay  implements Observer, DisplayElement {

    private float lastPressure;
    private float currentPressure = 29.2f;
    private Subject weatherData;



    public ForecastDisplay(WeatherData weatherData)
    {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {

        lastPressure = currentPressure;
        currentPressure = pressure;

        display();



    }

    @Override
    public void display() {

        System.out.println("Forecast: ");
        if(currentPressure >  lastPressure)
        {
            System.out.println("Improving weather on the way");
        }else if(currentPressure == lastPressure)
        {

            System.out.println("More of the same");
        }else if(currentPressure < lastPressure)
        {
            System.out.println("Watch out for cooler , rainy weather");

        }

    }
}
