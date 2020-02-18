public class MiniDuckSimulator {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack(); // A quacking duck
        mallard.performFly(); // Flying Duck

        Duck model = new ModelDuck();
        model.performFly();// FlyNoWay behaviour

        // Dynamically setting behaviour to fly with a rocket
        model.setFlyBehaviour(new FlyRocketPowered());
        model.performFly();// Flying with rocket
    }
}
