package behavioral.chain;

public class AdminUserHandler extends AbstractHandler {
    @Override
    public boolean handle(UserInfo userInfo) {
        if (userInfo.getRole() == "ADMIN") {
            return checkNext(userInfo);
        }
        return false;
    }
}
