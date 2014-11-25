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
package shoppingcart;

import org.hibernate.Query;
import org.orm.PersistentException;
import org.orm.PersistentSession;

import java.util.List;

public class ShoppingCartDAO {
    public static ShoppingCart loadShoppingCartByORMID(int id) throws PersistentException {
        try {
            PersistentSession session = login.PetStorePersistentManager.instance().getSession();
            return loadShoppingCartByORMID(session, id);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static ShoppingCart getShoppingCartByORMID(int id) throws PersistentException {
        try {
            PersistentSession session = login.PetStorePersistentManager.instance().getSession();
            return getShoppingCartByORMID(session, id);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static ShoppingCart loadShoppingCartByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
        try {
            PersistentSession session = login.PetStorePersistentManager.instance().getSession();
            return loadShoppingCartByORMID(session, id, lockMode);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static ShoppingCart getShoppingCartByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
        try {
            PersistentSession session = login.PetStorePersistentManager.instance().getSession();
            return getShoppingCartByORMID(session, id, lockMode);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static ShoppingCart loadShoppingCartByORMID(PersistentSession session, int id) throws PersistentException {
        try {
            return (ShoppingCart) session.load(shoppingcart.ShoppingCart.class, new Integer(id));
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static ShoppingCart getShoppingCartByORMID(PersistentSession session, int id) throws PersistentException {
        try {
            return (ShoppingCart) session.get(shoppingcart.ShoppingCart.class, new Integer(id));
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static ShoppingCart loadShoppingCartByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
        try {
            return (ShoppingCart) session.load(shoppingcart.ShoppingCart.class, new Integer(id), lockMode);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static ShoppingCart getShoppingCartByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
        try {
            return (ShoppingCart) session.get(shoppingcart.ShoppingCart.class, new Integer(id), lockMode);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static List queryShoppingCart(String condition, String orderBy) throws PersistentException {
        try {
            PersistentSession session = login.PetStorePersistentManager.instance().getSession();
            return queryShoppingCart(session, condition, orderBy);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static List queryShoppingCart(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
        try {
            PersistentSession session = login.PetStorePersistentManager.instance().getSession();
            return queryShoppingCart(session, condition, orderBy, lockMode);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static ShoppingCart[] listShoppingCartByQuery(String condition, String orderBy) throws PersistentException {
        try {
            PersistentSession session = login.PetStorePersistentManager.instance().getSession();
            return listShoppingCartByQuery(session, condition, orderBy);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static ShoppingCart[] listShoppingCartByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
        try {
            PersistentSession session = login.PetStorePersistentManager.instance().getSession();
            return listShoppingCartByQuery(session, condition, orderBy, lockMode);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static List queryShoppingCart(PersistentSession session, String condition, String orderBy) throws PersistentException {
        StringBuffer sb = new StringBuffer("From shoppingcart.ShoppingCart as ShoppingCart");
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

    public static List queryShoppingCart(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
        StringBuffer sb = new StringBuffer("From shoppingcart.ShoppingCart as ShoppingCart");
        if (condition != null)
            sb.append(" Where ").append(condition);
        if (orderBy != null)
            sb.append(" Order By ").append(orderBy);
        try {
            Query query = session.createQuery(sb.toString());
            query.setLockMode("ShoppingCart", lockMode);
            return query.list();
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static ShoppingCart[] listShoppingCartByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
        try {
            List list = queryShoppingCart(session, condition, orderBy);
            return (ShoppingCart[]) list.toArray(new ShoppingCart[list.size()]);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static ShoppingCart[] listShoppingCartByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
        try {
            List list = queryShoppingCart(session, condition, orderBy, lockMode);
            return (ShoppingCart[]) list.toArray(new ShoppingCart[list.size()]);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static ShoppingCart loadShoppingCartByQuery(String condition, String orderBy) throws PersistentException {
        try {
            PersistentSession session = login.PetStorePersistentManager.instance().getSession();
            return loadShoppingCartByQuery(session, condition, orderBy);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static ShoppingCart loadShoppingCartByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
        try {
            PersistentSession session = login.PetStorePersistentManager.instance().getSession();
            return loadShoppingCartByQuery(session, condition, orderBy, lockMode);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static ShoppingCart loadShoppingCartByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
        ShoppingCart[] shoppingCarts = listShoppingCartByQuery(session, condition, orderBy);
        if (shoppingCarts != null && shoppingCarts.length > 0)
            return shoppingCarts[0];
        else
            return null;
    }

    public static ShoppingCart loadShoppingCartByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
        ShoppingCart[] shoppingCarts = listShoppingCartByQuery(session, condition, orderBy, lockMode);
        if (shoppingCarts != null && shoppingCarts.length > 0)
            return shoppingCarts[0];
        else
            return null;
    }

    public static java.util.Iterator iterateShoppingCartByQuery(String condition, String orderBy) throws PersistentException {
        try {
            PersistentSession session = login.PetStorePersistentManager.instance().getSession();
            return iterateShoppingCartByQuery(session, condition, orderBy);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static java.util.Iterator iterateShoppingCartByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
        try {
            PersistentSession session = login.PetStorePersistentManager.instance().getSession();
            return iterateShoppingCartByQuery(session, condition, orderBy, lockMode);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static java.util.Iterator iterateShoppingCartByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
        StringBuffer sb = new StringBuffer("From shoppingcart.ShoppingCart as ShoppingCart");
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

    public static java.util.Iterator iterateShoppingCartByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
        StringBuffer sb = new StringBuffer("From shoppingcart.ShoppingCart as ShoppingCart");
        if (condition != null)
            sb.append(" Where ").append(condition);
        if (orderBy != null)
            sb.append(" Order By ").append(orderBy);
        try {
            Query query = session.createQuery(sb.toString());
            query.setLockMode("ShoppingCart", lockMode);
            return query.iterate();
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static ShoppingCart createShoppingCart() {
        return new shoppingcart.ShoppingCart();
    }

    public static boolean save(shoppingcart.ShoppingCart shoppingCart) throws PersistentException {
        try {
            login.PetStorePersistentManager.instance().saveObject(shoppingCart);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static boolean delete(shoppingcart.ShoppingCart shoppingCart) throws PersistentException {
        try {
            login.PetStorePersistentManager.instance().deleteObject(shoppingCart);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static boolean deleteAndDissociate(shoppingcart.ShoppingCart shoppingCart) throws PersistentException {
        try {
            if (shoppingCart.getUsuarioemail() != null) {
                shoppingCart.getUsuarioemail().shoppingCart.remove(shoppingCart);
            }

            shoppingcart.ShoppingCart_item[] lShoppingCart_items = shoppingCart.shoppingCart_item.toArray();
            for (int i = 0; i < lShoppingCart_items.length; i++) {
                lShoppingCart_items[i].setShoppingCart(null);
            }
            return delete(shoppingCart);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static boolean deleteAndDissociate(shoppingcart.ShoppingCart shoppingCart, org.orm.PersistentSession session) throws PersistentException {
        try {
            if (shoppingCart.getUsuarioemail() != null) {
                shoppingCart.getUsuarioemail().shoppingCart.remove(shoppingCart);
            }

            shoppingcart.ShoppingCart_item[] lShoppingCart_items = shoppingCart.shoppingCart_item.toArray();
            for (int i = 0; i < lShoppingCart_items.length; i++) {
                lShoppingCart_items[i].setShoppingCart(null);
            }
            try {
                session.delete(shoppingCart);
                return true;
            } catch (Exception e) {
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static boolean refresh(shoppingcart.ShoppingCart shoppingCart) throws PersistentException {
        try {
            login.PetStorePersistentManager.instance().getSession().refresh(shoppingCart);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static boolean evict(shoppingcart.ShoppingCart shoppingCart) throws PersistentException {
        try {
            login.PetStorePersistentManager.instance().getSession().evict(shoppingCart);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static ShoppingCart loadShoppingCartByCriteria(ShoppingCartCriteria shoppingCartCriteria) {
        ShoppingCart[] shoppingCarts = listShoppingCartByCriteria(shoppingCartCriteria);
        if (shoppingCarts == null || shoppingCarts.length == 0) {
            return null;
        }
        return shoppingCarts[0];
    }

    public static ShoppingCart[] listShoppingCartByCriteria(ShoppingCartCriteria shoppingCartCriteria) {
        return shoppingCartCriteria.listShoppingCart();
    }
}
