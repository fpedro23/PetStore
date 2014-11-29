package login;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;


/**
 * Created by Pedro on 22/11/14.
 */
public class LoginAD implements LoginADInterface {

    private static final int ROW_COUNT = 100;


    @Override
    public Usuario doLogin(String userName, String password) throws PersistentException {

        System.out.println("Listing Usuario...");
        UsuarioCriteria usuarioCriteria = new UsuarioCriteria();
        usuarioCriteria.email.eq(userName);
        usuarioCriteria.password.eq(password);

        Usuario[] usuario = UsuarioDAO.listUsuarioByCriteria(usuarioCriteria);

        if (usuario.length == 1) {
            return usuario[0];
        } else {
            return null;

        }

    }

    @Override
    public boolean registerNewUser(String email, String password, String direccion, String numeroTelefono, String mascotaFavorita) throws PersistentException {

        PersistentTransaction t = login.PetStorePersistentManager.instance().getSession().beginTransaction();
        try {

            Usuario usuario = UsuarioDAO.createUsuario();
            usuario.setEmail(email);
            usuario.setPassword(password);
            usuario.setDireccion(direccion);
            usuario.setNumeroTelefono(numeroTelefono);
            usuario.setMascotaFavorita(mascotaFavorita);
            UsuarioDAO.save(usuario);
            t.commit();
            return true;
        } catch (Exception e) {
            t.rollback();
            return false;
        }
    }


}
