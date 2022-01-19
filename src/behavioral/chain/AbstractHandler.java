package behavioral.chain;

/*
* The default chaining behavior
* */
public class AbstractHandler implements Handler {
    private Handler nextHandler;

    /*
    * @handler: the next handler in the chain
    * */
    @Override
    public Handler setNext(Handler handler) {
        this.nextHandler = handler;
        return handler;
    }

    /*
    * @request: the business logic to deal with
    * */
    @Override
    public String handle(String request) {
        if (request == "USER_LOGGED") {
            return "Logged! Processing...";
        }
        return "You must be logged";
    }
}
