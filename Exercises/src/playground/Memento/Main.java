public class Main {

    public static void main(String[] args) {
        BigCompany bc = new BigCompany();
        Employee pankaj = new Employee();
        bc.pay(pankaj);
        bc.pay(pankaj);
        bc.promote(pankaj);
        bc.pay(pankaj);
        bc.pay(pankaj);
        bc.promote(pankaj);
        bc.undo(pankaj);
        bc.undo(pankaj);
        bc.pay(pankaj);
        bc.pay(pankaj);
        bc.promote(pankaj);
        bc.pay(pankaj);
    }
}
