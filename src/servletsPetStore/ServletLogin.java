package servletsPetStore;

import com.opensymphony.xwork2.ActionSupport;
import login.LoginAD;
import login.LoginADInterface;
import login.LoginFactory;
import login.Usuario;
import org.apache.struts2.interceptor.SessionAware;
import org.orm.PersistentException;

import java.util.Map;

/**
 * Created by Pedro on 22/11/14.
 */
public class ServletLogin extends ActionSupport implements SessionAware {

    public String mensajeResultado;
    public String mensajeSubResultado;
    private String email;
    private String password;
    private String direccion;
    private String numeroTelefono;
    private String mascotaFavorita;
    private LoginAD loginAD;
    private Map<String, Object> sessionMap;

    @Override
    public void setSession(Map<String, Object> sessionMap) {
        this.sessionMap = sessionMap;
    }


    public String doLogin() throws PersistentException {
        LoginFactory factory = new LoginFactory();
        LoginADInterface loginAD = factory.getLoginAD("LOGINAD");
        Usuario resultado = loginAD.doLogin(email, password);

        if (resultado != null) {
            mensajeResultado = "Bienvenido " + resultado.getEmail();
            mensajeSubResultado = "Haz iniciado sesi&oacute;n correctamente.";

            sessionMap.put("nombreUsuario", resultado);
            return "success";
        } else {
            mensajeResultado = "Login Fallido";
            return "error";
        }

    }

    public String logout() {
        // remove userName from the session
        if (sessionMap.containsKey("nombreUsuario")) {
            sessionMap.remove("nombreUsuario");
        }
        return SUCCESS;
    }

    public String registerUser() throws PersistentException {
        LoginFactory factory = new LoginFactory();
        LoginADInterface loginAD = factory.getLoginAD("LOGINAD");
        boolean resultado = loginAD.registerNewUser(email, password, direccion, numeroTelefono, mascotaFavorita);
        if (resultado) {
            mensajeResultado = "Registro de usuario exitoso";
            return "success";
        } else {
            mensajeResultado = "Registro de usuario no exitoso";
            return "error";
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public String getMascotaFavorita() {
        return mascotaFavorita;
    }

    public void setMascotaFavorita(String mascotaFavorita) {
        this.mascotaFavorita = mascotaFavorita;
    }
}
