package behavioral.chain;

public class Client {
    private final Handler handler;

    Client (Handler handler) {
        this.handler = handler;
    }

    public String handleRequest(String[] requests) {
        String result = "";
        for (String request : requests ) {
           result = handler.handle(request);
        }
        return result;
    }
}
