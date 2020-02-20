// Abstract class
public abstract class Beverage {

    String description = "Unknown Beverage";

    //getDescription already implemented
    public String getDescription(){
        return description;
    }

    public abstract double cost();

}
