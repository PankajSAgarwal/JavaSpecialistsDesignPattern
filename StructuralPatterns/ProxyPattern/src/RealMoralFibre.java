public class RealMoralFibre implements MoralFibre{
    //very expensive to make moral fibres

    private byte[] costOfMoralFibre = new byte[900_000];
    {
        System.out.println("Moral Fibre created");
    }
    @Override
    public double actSociallyResponsibly() {
        //AIDS Orphans
        return costOfMoralFibre.length;//3
    }

    @Override
    public double empowerEmployees() {
        // shares to employees
        return costOfMoralFibre.length; //3
    }

    @Override
    public double cleanupEnvironment() {
        // oiled sea bed
        return costOfMoralFibre.length; // 3
    }
}
