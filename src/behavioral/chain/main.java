package behavioral.chain;

public class main {
    public static void main(String[] args) {
        /**
         * Instantiating each handler
         */
        AbstractHandler adminUserHandler = new AdminUserHandler();
        AbstractHandler grantAccessHandler = new GrantAccessHandler();

        /**
         * Setting the chain
         */
        adminUserHandler.setNext(grantAccessHandler);

        UserInfo userInfo = new UserInfo("ADMIN", true, true);

        ClientCode.clientCode(adminUserHandler, userInfo);
    }
}
