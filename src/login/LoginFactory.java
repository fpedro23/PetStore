package login;

/**
 * Created by Pedro on 28/11/14.
 */
public class LoginFactory {
    public LoginADInterface getLoginAD(String loginType) {
        if (loginType == null) {
            return null;
        }
        if (loginType.equalsIgnoreCase("LOGINAD")) {
            return new LoginAD();
        } else
            return null;
    }

}
