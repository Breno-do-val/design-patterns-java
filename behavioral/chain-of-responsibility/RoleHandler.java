package behavioral.chain;

public class RoleHandler extends AbstractHandler {
    public String handle(String request) {
        if (request.equals("USER_ADMIN")) {
            return "Granted! Processing...";
        }
        return super.handle(request);
    }
}
