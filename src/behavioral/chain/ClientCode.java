package behavioral.chain;

public class ClientCode {

    public static void clientCode(AbstractHandler handler, UserInfo userInfo) {
        System.out.println("Starting the process");
        if(handler.handle(userInfo)) {
            System.out.println("User meets all the requirements");
        } else {
            System.out.println("User must be admin and his password must be validated!");
        }
    }
}
