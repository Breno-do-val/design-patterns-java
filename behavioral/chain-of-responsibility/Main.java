package behavioral.chain;

public class Main {

    public static void main(String[] args) {
        String[] requests = { "USER_ADMIN"};
        RoleHandler roleHandler = new RoleHandler();
        Client myClient = new Client(roleHandler);
        String result = myClient.handleRequest(requests);
        System.out.println(result);
    }

}
