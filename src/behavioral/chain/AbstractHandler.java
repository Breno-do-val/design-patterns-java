package behavioral.chain;

/**
 * Default handler in case other handlers can not process the request
 */
public abstract class AbstractHandler implements IHandler {
    private IHandler nextHandler;

    public IHandler setNext(IHandler handler) {
        this.nextHandler = handler;
        return handler;
    }

    public String handle(String request) {
        if (request == "USER_LOGGED") {
            return "Processing request";
        }
        return null;
    }
}
