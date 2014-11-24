package servletsPetStore;

import com.opensymphony.xwork2.ActionSupport;
import login.RegisterAD;
//import login.Usuario;
//import org.orm.PersistentException;

/**
 * Created by paoviquez on 23/11/14.
 */
public class ServletRegister extends ActionSupport {
    private String email;
    private String password;
    private String direccion;
    private String numeroTelefono;
    private String mascotaFavorita;

    private RegisterAD registerAD;

    //public String regUser() throws PersistentException {
    public String regUser() {
        //RegisterAD regUser = new RegisterAD();
        //Usuario a = regUser.createUsuario();

        //System.out.println(getUser());
        System.out.println("Datos");
        System.out.println(getPassword());
        System.out.println(getDireccion());
        System.out.println(getEmail());
        System.out.println(getMascotaFavorita());
        System.out.println(getNumeroTelefono());
        return "success";
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

    public RegisterAD getRegisterAD() {
        return registerAD;
    }

    public void setRegisterAD(RegisterAD registerAD) {
        this.registerAD = registerAD;
    }
}
