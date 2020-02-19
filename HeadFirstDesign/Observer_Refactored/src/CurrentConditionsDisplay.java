import java.util.Observable;
import java.util.Observer;

// implementing Observer interface
public class CurrentConditionsDisplay implements Observer,DisplayElement {

    Observable observable;
    private float temperature;
    private float humidity;

    // Constructor takes an Observable and we use this to add current conditions
    // object as an observer
    public CurrentConditionsDisplay(Observable observable) {

        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current Conditions :" + temperature + " F degrees and "
        + humidity + " % humidity");
    }


    @Override
    public void update(Observable obs, Object arg) {

        if(obs instanceof WeatherData){

            WeatherData weatherData = (WeatherData)obs;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();

        }

    }
}
