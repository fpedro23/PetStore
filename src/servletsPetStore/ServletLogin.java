package servletsPetStore;

import com.opensymphony.xwork2.ActionSupport;
import login.LoginAD;
import org.orm.PersistentException;

/**
 * Created by Pedro on 22/11/14.
 */
public class ServletLogin extends ActionSupport {

    private String user;
    private String pass;
    private LoginAD loginAD;

    public String doLogin() throws PersistentException {
        loginAD = new LoginAD();
        boolean a = loginAD.doLogin(user, pass);

        System.out.println(getUser());
        return "success";
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
}
