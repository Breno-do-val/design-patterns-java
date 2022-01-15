package behavioral.chain;

public interface Handler {
    Handler setNext(Handler handler);
    String handle(String request);
}
