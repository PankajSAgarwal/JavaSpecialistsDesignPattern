public class Company {

    private final MoralFibre moralFibre;
    private final String name;
    private int cash;

    public Company(String name, int cash,MoralFibre moralFibre) {
        this.moralFibre = moralFibre;
        this.name = name;
        this.cash = cash;
    }

    public void makeMoney(){
        System.out.println("Company is making money");
    }

    public void damageEnvironment(){

        System.out.println("Company is damaging environment");
    }

    public void becomeFocusOnMediaAttention(){
        System.out.println("Look how good we are");
        cash -= moralFibre.actSociallyResponsibly();
        cash -= moralFibre.cleanupEnvironment();
        cash -= moralFibre.empowerEmployees();
    }


}
