public class Main {

    public static void main(String[] args) {
        Server server = new Server.Builder().port(80).build();

        System.out.println("server = " + server);
    }
}
