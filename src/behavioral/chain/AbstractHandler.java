package behavioral.chain;

/**
 * Default handler in case other handlers can not process the request
 */
public abstract class AbstractHandler {
    private AbstractHandler nextHandler;

    /**
     * Builds chains of middlewares
     * @param handler the next handler to be called
     * @return the handler reference
     */
    public AbstractHandler setNext(AbstractHandler handler) {
        this.nextHandler = handler;
        return nextHandler;
    }

    /**
     * Subclasses will implement this method with concrete checks
     * @param userInfo the request to be managed
     * @return the return value based upon business logic
     */
    public abstract boolean handle(UserInfo userInfo);

    /**
     * Runs checks on the next object in the chain or ends traversing if it be the last object in the chain
     * @param userInfo the request to be passed to next handler
     * @return the value to decided whether to stop or not
     */
    protected boolean checkNext(UserInfo userInfo) {
        if (nextHandler == null) {
            return true;
        }
        return nextHandler.handle(userInfo);
    }
}
