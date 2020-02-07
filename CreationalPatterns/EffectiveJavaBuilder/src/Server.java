public class Server {

    private final int port;
    private final String hostname;

    public Server(int port, String hostname) {
        this.port = port;
        this.hostname = hostname;
    }

    public static class Builder{

       private int port = 80;
       private String hostname = "localhost";

       public Builder port(int port){
           this.port = port;
           return this;
       }

       public Builder hostname(String hostname){
           this.hostname = hostname;
           return this;
       }

       public Server build(){
           return new Server(port,hostname);
       }
    }
}
