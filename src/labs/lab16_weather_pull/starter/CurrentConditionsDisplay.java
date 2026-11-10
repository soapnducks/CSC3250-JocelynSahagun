// CSC-3250 classroom adaptation of the SimUDuck / Weather-O-Rama examples.
// Conceptual source: Freeman & Robson, Head First Design Patterns, 2nd ed.
// Original classroom scaffolding and visible checks; no external libraries required.
package labs.lab16_weather_pull.starter;
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private final WeatherData weatherData;
    private float temperature, humidity;
    private int updates;
    public CurrentConditionsDisplay(WeatherData source) {
        weatherData = source;
        source.registerObserver(this);
    }
    @Override public void update() {
        temperature = weatherData.getTemperature();
        humidity = weatherData.getHumidity();
        updates++;
        display();
    }
    @Override public void display() {
        System.out.printf(java.util.Locale.US, "Current: %.1f F, humidity %.1f%%%n", temperature, humidity);
    }
    public float getTemperature() { return temperature; }
    public float getHumidity() { return humidity; }
    public int getUpdates() { return updates; }
}