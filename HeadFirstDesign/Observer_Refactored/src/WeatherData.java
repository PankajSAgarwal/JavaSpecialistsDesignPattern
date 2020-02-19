import java.util.Observable;

public class WeatherData extends Observable { // subclassing Observable

    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {

        // Constructor doesn't require a datastructure to to hold observers
    }

    public void measurementsChanged(){

        // Both setChanged and notifyObservers are from Observable class
        // setChanged() needs to be first called to indicate state has changed before
        // calling notifyObservers()
        setChanged();
        // We aren't sending a data object with the notifyObserver call .
        // That means we are using PULL model
        notifyObservers();

    }

    public void setMeasurements(float temperature,float humidity,float pressure){

        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
