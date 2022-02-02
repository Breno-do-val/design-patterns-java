package behavioral.chain;

/**
 * Define the methods that all the handlers must implement
 */
public interface IHandler {
    /**
     * Method for building a chain of handlers
     * @param handler A handler to be set as next
     * @return Handler
     */
    IHandler setNext(IHandler handler);

    /**
     * Method for dealing with requests defined based on business context
     * @param request Value to processed by each handler
     * @return String based on business rule
     */
    String handle(String request);
}
