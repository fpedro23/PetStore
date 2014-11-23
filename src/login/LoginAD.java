package login;

import org.orm.PersistentException;


/**
 * Created by Pedro on 22/11/14.
 */
public class LoginAD {

    private static final int ROW_COUNT = 100;


    public boolean doLogin(String userName, String password) throws PersistentException {

        System.out.println("Listing Usuario...");

        login.Usuario[] loginUsuarios = login.UsuarioDAO.listUsuarioByQuery(null, null);

        System.out.println(login.UsuarioDAO.getUsuarioByORMID("fpedro3@gmail.com"));

        int length = Math.min(loginUsuarios.length, ROW_COUNT);
        for (int i = 0; i < length; i++) {
            System.out.println(loginUsuarios[i].getDireccion());
        }
        System.out.println(length + " record(s) retrieved.");

        return true;
    }


}
