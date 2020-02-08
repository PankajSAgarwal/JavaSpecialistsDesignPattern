public class WorldMarket0 {

    // Virtually Proxy Test
    public static void main(String[] args) {

    Company xyz = new Company("xyz",1_000_000,new VirtualMoralFibre());

    xyz.makeMoney();
    xyz.makeMoney();
    System.out.println(xyz);
    xyz.damageEnvironment();
    System.out.println(xyz);
    xyz.becomeFocusOnMediaAttention();
    System.out.println(xyz);

    }
}
