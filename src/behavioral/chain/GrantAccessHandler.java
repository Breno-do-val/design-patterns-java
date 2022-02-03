package behavioral.chain;

public class GrantAccessHandler extends AbstractHandler {
    @Override
    public boolean handle(UserInfo userInfo) {
        if (userInfo.getPasswordValidated()) {
            return checkNext(userInfo);
        }
        return false;
    }
}
