package login;

import org.orm.PersistentException;

/**
 * Created by Paola on 22/11/14.
 */
public class RegisterAD {

    public static Usuario createUsuario() {
        return new login.Usuario();
    }

    public static boolean save(login.Usuario usuario) throws PersistentException {
        try {
            login.PetStorePersistentManager.instance().saveObject(usuario);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }
}
