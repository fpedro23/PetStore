/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 *
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 *
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: 
 * License Type: Evaluation
 */

package login;

import org.hibernate.Query;
import org.orm.PersistentException;
import org.orm.PersistentSession;

import java.util.List;

public class UsuarioDAO {
    public static Usuario loadUsuarioByORMID(String email) throws PersistentException {
        try {
            PersistentSession session = login.PetStorePersistentManager.instance().getSession();
            return loadUsuarioByORMID(session, email);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Usuario getUsuarioByORMID(String email) throws PersistentException {
        try {
            PersistentSession session = login.PetStorePersistentManager.instance().getSession();
            return getUsuarioByORMID(session, email);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Usuario loadUsuarioByORMID(String email, org.hibernate.LockMode lockMode) throws PersistentException {
        try {
            PersistentSession session = login.PetStorePersistentManager.instance().getSession();
            return loadUsuarioByORMID(session, email, lockMode);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Usuario getUsuarioByORMID(String email, org.hibernate.LockMode lockMode) throws PersistentException {
        try {
            PersistentSession session = login.PetStorePersistentManager.instance().getSession();
            return getUsuarioByORMID(session, email, lockMode);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Usuario loadUsuarioByORMID(PersistentSession session, String email) throws PersistentException {
        try {
            return (Usuario) session.load(login.Usuario.class, email);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Usuario getUsuarioByORMID(PersistentSession session, String email) throws PersistentException {
        try {
            return (Usuario) session.get(login.Usuario.class, email);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Usuario loadUsuarioByORMID(PersistentSession session, String email, org.hibernate.LockMode lockMode) throws PersistentException {
        try {
            return (Usuario) session.load(login.Usuario.class, email, lockMode);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Usuario getUsuarioByORMID(PersistentSession session, String email, org.hibernate.LockMode lockMode) throws PersistentException {
        try {
            return (Usuario) session.get(login.Usuario.class, email, lockMode);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static List queryUsuario(String condition, String orderBy) throws PersistentException {
        try {
            PersistentSession session = login.PetStorePersistentManager.instance().getSession();
            return queryUsuario(session, condition, orderBy);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static List queryUsuario(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
        try {
            PersistentSession session = login.PetStorePersistentManager.instance().getSession();
            return queryUsuario(session, condition, orderBy, lockMode);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Usuario[] listUsuarioByQuery(String condition, String orderBy) throws PersistentException {
        try {
            PersistentSession session = login.PetStorePersistentManager.instance().getSession();
            return listUsuarioByQuery(session, condition, orderBy);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Usuario[] listUsuarioByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
        try {
            PersistentSession session = login.PetStorePersistentManager.instance().getSession();
            return listUsuarioByQuery(session, condition, orderBy, lockMode);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static List queryUsuario(PersistentSession session, String condition, String orderBy) throws PersistentException {
        StringBuffer sb = new StringBuffer("From login.Usuario as Usuario");
        if (condition != null)
            sb.append(" Where ").append(condition);
        if (orderBy != null)
            sb.append(" Order By ").append(orderBy);
        try {
            Query query = session.createQuery(sb.toString());
            return query.list();
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static List queryUsuario(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
        StringBuffer sb = new StringBuffer("From login.Usuario as Usuario");
        if (condition != null)
            sb.append(" Where ").append(condition);
        if (orderBy != null)
            sb.append(" Order By ").append(orderBy);
        try {
            Query query = session.createQuery(sb.toString());
            query.setLockMode("Usuario", lockMode);
            return query.list();
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Usuario[] listUsuarioByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
        try {
            List list = queryUsuario(session, condition, orderBy);
            return (Usuario[]) list.toArray(new Usuario[list.size()]);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Usuario[] listUsuarioByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
        try {
            List list = queryUsuario(session, condition, orderBy, lockMode);
            return (Usuario[]) list.toArray(new Usuario[list.size()]);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Usuario loadUsuarioByQuery(String condition, String orderBy) throws PersistentException {
        try {
            PersistentSession session = login.PetStorePersistentManager.instance().getSession();
            return loadUsuarioByQuery(session, condition, orderBy);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Usuario loadUsuarioByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
        try {
            PersistentSession session = login.PetStorePersistentManager.instance().getSession();
            return loadUsuarioByQuery(session, condition, orderBy, lockMode);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Usuario loadUsuarioByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
        Usuario[] usuarios = listUsuarioByQuery(session, condition, orderBy);
        if (usuarios != null && usuarios.length > 0)
            return usuarios[0];
        else
            return null;
    }

    public static Usuario loadUsuarioByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
        Usuario[] usuarios = listUsuarioByQuery(session, condition, orderBy, lockMode);
        if (usuarios != null && usuarios.length > 0)
            return usuarios[0];
        else
            return null;
    }

    public static java.util.Iterator iterateUsuarioByQuery(String condition, String orderBy) throws PersistentException {
        try {
            PersistentSession session = login.PetStorePersistentManager.instance().getSession();
            return iterateUsuarioByQuery(session, condition, orderBy);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static java.util.Iterator iterateUsuarioByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
        try {
            PersistentSession session = login.PetStorePersistentManager.instance().getSession();
            return iterateUsuarioByQuery(session, condition, orderBy, lockMode);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static java.util.Iterator iterateUsuarioByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
        StringBuffer sb = new StringBuffer("From login.Usuario as Usuario");
        if (condition != null)
            sb.append(" Where ").append(condition);
        if (orderBy != null)
            sb.append(" Order By ").append(orderBy);
        try {
            Query query = session.createQuery(sb.toString());
            return query.iterate();
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static java.util.Iterator iterateUsuarioByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
        StringBuffer sb = new StringBuffer("From login.Usuario as Usuario");
        if (condition != null)
            sb.append(" Where ").append(condition);
        if (orderBy != null)
            sb.append(" Order By ").append(orderBy);
        try {
            Query query = session.createQuery(sb.toString());
            query.setLockMode("Usuario", lockMode);
            return query.iterate();
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

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

    public static boolean delete(login.Usuario usuario) throws PersistentException {
        try {
            login.PetStorePersistentManager.instance().deleteObject(usuario);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static boolean deleteAndDissociate(login.Usuario usuario) throws PersistentException {
        try {
            shoppingcart.ShoppingCart[] lShoppingCarts = usuario.shoppingCart.toArray();
            for (int i = 0; i < lShoppingCarts.length; i++) {
                lShoppingCarts[i].setUsuarioemail(null);
            }
            return delete(usuario);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static boolean deleteAndDissociate(login.Usuario usuario, org.orm.PersistentSession session) throws PersistentException {
        try {
            shoppingcart.ShoppingCart[] lShoppingCarts = usuario.shoppingCart.toArray();
            for (int i = 0; i < lShoppingCarts.length; i++) {
                lShoppingCarts[i].setUsuarioemail(null);
            }
            try {
                session.delete(usuario);
                return true;
            } catch (Exception e) {
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static boolean refresh(login.Usuario usuario) throws PersistentException {
        try {
            login.PetStorePersistentManager.instance().getSession().refresh(usuario);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static boolean evict(login.Usuario usuario) throws PersistentException {
        try {
            login.PetStorePersistentManager.instance().getSession().evict(usuario);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Usuario loadUsuarioByCriteria(UsuarioCriteria usuarioCriteria) {
        Usuario[] usuarios = listUsuarioByCriteria(usuarioCriteria);
        if (usuarios == null || usuarios.length == 0) {
            return null;
        }
        return usuarios[0];
    }

    public static Usuario[] listUsuarioByCriteria(UsuarioCriteria usuarioCriteria) {
        return usuarioCriteria.listUsuario();
    }
}
