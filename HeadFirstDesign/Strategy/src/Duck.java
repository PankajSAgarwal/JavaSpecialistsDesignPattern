public abstract class Duck {
    FlyBehaviour flyBehaviour;
    QuackingBehaviour quackBehaviour;

    public Duck() {
    }

    public void performQuack(){
        quackBehaviour.quack();
    }

    public void performFly(){
        flyBehaviour.fly();
    }

    public void swim(){
        System.out.println("All ducks flats ,even decoys");
    }

    public void setFlyBehaviour(FlyBehaviour fb){
        flyBehaviour = fb;
    }

    public void setQuackBehaviour(QuackingBehaviour qb){
        quackBehaviour = qb;
    }
}
