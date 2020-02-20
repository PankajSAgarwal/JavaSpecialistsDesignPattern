public class Espresso extends Beverage {

    public Espresso() {
        // description instance variable inherited from base class Beverage
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
