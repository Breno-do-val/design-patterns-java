package behavioral.chain;

public class AdminUserHandler extends AbstractHandler {
    @Override
    public String handle(String request) {
        if (request != "ADMIN_PROFILE") {
            return "User must be admin";
        }
        return this.handle(request);
    }
}
