// Mocha is a decorator and so we extend CondimentDecorator
//CondimentDecorator extends Beverage
public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        // Delegate to the object being decorated to get the description and then add "Mocha"
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        // Delegate to the object being decorated to get the cost and then add cost of "Mocha"
        return beverage.cost() + .20;
    }
}
