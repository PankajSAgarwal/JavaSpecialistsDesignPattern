// Decorator and component that is decorated need to be interchangeable
public abstract class CondimentDecorator extends Beverage {
    // Condiment decorator re-implement the getDescription()
    public abstract String getDescription();
}
