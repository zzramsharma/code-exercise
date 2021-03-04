package designpatterns.observer;

public class StatisticsDisplay implements DisplayElement {

    private final Subject weatherData;
    private float temperature;
    private float humidity;
    private float pressure;

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Statistics Display: Temperature " + temperature + " degrees, Humidity "
                + humidity + ", Pressure " + pressure);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        display();
    }
}
