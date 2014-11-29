package login;

import org.orm.PersistentException;

/**
 * Created by Pedro on 28/11/14.
 */
public interface LoginADInterface {
    Usuario doLogin(String userName, String password) throws PersistentException;

    boolean registerNewUser(String email, String password, String direccion, String numeroTelefono, String mascotaFavorita) throws PersistentException;
}
