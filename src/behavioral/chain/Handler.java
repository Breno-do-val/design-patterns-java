package behavioral.chain;

/*
*  @setNext: receives a reference for the next handler
*  @handle: the method signature for handling the requests
* */
public interface Handler {
    Handler setNext(Handler handler);
    String handle(String request);
}
