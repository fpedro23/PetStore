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

public class ShoppingCart_itemDAO {
    public static ShoppingCart_item loadShoppingCart_itemByORMID(shoppingcart.ShoppingCart shoppingCart, productos.Item item) throws PersistentException {
        try {
            PersistentSession session = login.PetStorePersistentManager.instance().getSession();
            return loadShoppingCart_itemByORMID(session, shoppingCart, item);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static ShoppingCart_item getShoppingCart_itemByORMID(shoppingcart.ShoppingCart shoppingCart, productos.Item item) throws PersistentException {
        try {
            PersistentSession session = login.PetStorePersistentManager.instance().getSession();
            return getShoppingCart_itemByORMID(session, shoppingCart, item);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static ShoppingCart_item loadShoppingCart_itemByORMID(shoppingcart.ShoppingCart shoppingCart, productos.Item item, org.hibernate.LockMode lockMode) throws PersistentException {
        try {
            PersistentSession session = login.PetStorePersistentManager.instance().getSession();
            return loadShoppingCart_itemByORMID(session, shoppingCart, item, lockMode);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static ShoppingCart_item getShoppingCart_itemByORMID(shoppingcart.ShoppingCart shoppingCart, productos.Item item, org.hibernate.LockMode lockMode) throws PersistentException {
        try {
            PersistentSession session = login.PetStorePersistentManager.instance().getSession();
            return getShoppingCart_itemByORMID(session, shoppingCart, item, lockMode);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static ShoppingCart_item loadShoppingCart_itemByORMID(PersistentSession session, shoppingcart.ShoppingCart shoppingCart, productos.Item item) throws PersistentException {
        try {
            ShoppingCart_item shoppingcart_item = new shoppingcart.ShoppingCart_item();
            shoppingcart_item.setORM_ShoppingCart(shoppingCart);
            shoppingcart_item.setORM_Item(item);

            return (ShoppingCart_item) session.load(shoppingcart.ShoppingCart_item.class, shoppingcart_item);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static ShoppingCart_item getShoppingCart_itemByORMID(PersistentSession session, shoppingcart.ShoppingCart shoppingCart, productos.Item item) throws PersistentException {
        try {
            ShoppingCart_item shoppingcart_item = new shoppingcart.ShoppingCart_item();
            shoppingcart_item.setORM_ShoppingCart(shoppingCart);
            shoppingcart_item.setORM_Item(item);

            return (ShoppingCart_item) session.get(shoppingcart.ShoppingCart_item.class, shoppingcart_item);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static ShoppingCart_item loadShoppingCart_itemByORMID(PersistentSession session, shoppingcart.ShoppingCart shoppingCart, productos.Item item, org.hibernate.LockMode lockMode) throws PersistentException {
        try {
            ShoppingCart_item shoppingcart_item = new shoppingcart.ShoppingCart_item();
            shoppingcart_item.setORM_ShoppingCart(shoppingCart);
            shoppingcart_item.setORM_Item(item);

            return (ShoppingCart_item) session.load(shoppingcart.ShoppingCart_item.class, shoppingcart_item, lockMode);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static ShoppingCart_item getShoppingCart_itemByORMID(PersistentSession session, shoppingcart.ShoppingCart shoppingCart, productos.Item item, org.hibernate.LockMode lockMode) throws PersistentException {
        try {
            ShoppingCart_item shoppingcart_item = new shoppingcart.ShoppingCart_item();
            shoppingcart_item.setORM_ShoppingCart(shoppingCart);
            shoppingcart_item.setORM_Item(item);

            return (ShoppingCart_item) session.get(shoppingcart.ShoppingCart_item.class, shoppingcart_item, lockMode);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static List queryShoppingCart_item(String condition, String orderBy) throws PersistentException {
        try {
            PersistentSession session = login.PetStorePersistentManager.instance().getSession();
            return queryShoppingCart_item(session, condition, orderBy);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static List queryShoppingCart_item(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
        try {
            PersistentSession session = login.PetStorePersistentManager.instance().getSession();
            return queryShoppingCart_item(session, condition, orderBy, lockMode);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static ShoppingCart_item[] listShoppingCart_itemByQuery(String condition, String orderBy) throws PersistentException {
        try {
            PersistentSession session = login.PetStorePersistentManager.instance().getSession();
            return listShoppingCart_itemByQuery(session, condition, orderBy);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static ShoppingCart_item[] listShoppingCart_itemByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
        try {
            PersistentSession session = login.PetStorePersistentManager.instance().getSession();
            return listShoppingCart_itemByQuery(session, condition, orderBy, lockMode);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static List queryShoppingCart_item(PersistentSession session, String condition, String orderBy) throws PersistentException {
        StringBuffer sb = new StringBuffer("From shoppingcart.ShoppingCart_item as ShoppingCart_item");
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

    public static List queryShoppingCart_item(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
        StringBuffer sb = new StringBuffer("From shoppingcart.ShoppingCart_item as ShoppingCart_item");
        if (condition != null)
            sb.append(" Where ").append(condition);
        if (orderBy != null)
            sb.append(" Order By ").append(orderBy);
        try {
            Query query = session.createQuery(sb.toString());
            query.setLockMode("ShoppingCart_item", lockMode);
            return query.list();
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static ShoppingCart_item[] listShoppingCart_itemByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
        try {
            List list = queryShoppingCart_item(session, condition, orderBy);
            return (ShoppingCart_item[]) list.toArray(new ShoppingCart_item[list.size()]);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static ShoppingCart_item[] listShoppingCart_itemByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
        try {
            List list = queryShoppingCart_item(session, condition, orderBy, lockMode);
            return (ShoppingCart_item[]) list.toArray(new ShoppingCart_item[list.size()]);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static ShoppingCart_item loadShoppingCart_itemByQuery(String condition, String orderBy) throws PersistentException {
        try {
            PersistentSession session = login.PetStorePersistentManager.instance().getSession();
            return loadShoppingCart_itemByQuery(session, condition, orderBy);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static ShoppingCart_item loadShoppingCart_itemByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
        try {
            PersistentSession session = login.PetStorePersistentManager.instance().getSession();
            return loadShoppingCart_itemByQuery(session, condition, orderBy, lockMode);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static ShoppingCart_item loadShoppingCart_itemByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
        ShoppingCart_item[] shoppingCart_items = listShoppingCart_itemByQuery(session, condition, orderBy);
        if (shoppingCart_items != null && shoppingCart_items.length > 0)
            return shoppingCart_items[0];
        else
            return null;
    }

    public static ShoppingCart_item loadShoppingCart_itemByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
        ShoppingCart_item[] shoppingCart_items = listShoppingCart_itemByQuery(session, condition, orderBy, lockMode);
        if (shoppingCart_items != null && shoppingCart_items.length > 0)
            return shoppingCart_items[0];
        else
            return null;
    }

    public static java.util.Iterator iterateShoppingCart_itemByQuery(String condition, String orderBy) throws PersistentException {
        try {
            PersistentSession session = login.PetStorePersistentManager.instance().getSession();
            return iterateShoppingCart_itemByQuery(session, condition, orderBy);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static java.util.Iterator iterateShoppingCart_itemByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
        try {
            PersistentSession session = login.PetStorePersistentManager.instance().getSession();
            return iterateShoppingCart_itemByQuery(session, condition, orderBy, lockMode);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static java.util.Iterator iterateShoppingCart_itemByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
        StringBuffer sb = new StringBuffer("From shoppingcart.ShoppingCart_item as ShoppingCart_item");
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

    public static java.util.Iterator iterateShoppingCart_itemByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
        StringBuffer sb = new StringBuffer("From shoppingcart.ShoppingCart_item as ShoppingCart_item");
        if (condition != null)
            sb.append(" Where ").append(condition);
        if (orderBy != null)
            sb.append(" Order By ").append(orderBy);
        try {
            Query query = session.createQuery(sb.toString());
            query.setLockMode("ShoppingCart_item", lockMode);
            return query.iterate();
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static ShoppingCart_item createShoppingCart_item() {
        return new shoppingcart.ShoppingCart_item();
    }

    public static boolean save(shoppingcart.ShoppingCart_item shoppingCart_item) throws PersistentException {
        try {
            login.PetStorePersistentManager.instance().saveObject(shoppingCart_item);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static boolean delete(shoppingcart.ShoppingCart_item shoppingCart_item) throws PersistentException {
        try {
            login.PetStorePersistentManager.instance().deleteObject(shoppingCart_item);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static boolean deleteAndDissociate(shoppingcart.ShoppingCart_item shoppingCart_item) throws PersistentException {
        try {
            shoppingcart.ShoppingCart shoppingCart = shoppingCart_item.getShoppingCart();
            if (shoppingCart_item.getShoppingCart() != null) {
                shoppingCart_item.getShoppingCart().shoppingCart_item.remove(shoppingCart_item);
            }
            shoppingCart_item.setORM_ShoppingCart(shoppingCart);

            productos.Item item = shoppingCart_item.getItem();
            if (shoppingCart_item.getItem() != null) {
                shoppingCart_item.getItem().shoppingCart_item.remove(shoppingCart_item);
            }
            shoppingCart_item.setORM_Item(item);

            return delete(shoppingCart_item);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static boolean deleteAndDissociate(shoppingcart.ShoppingCart_item shoppingCart_item, org.orm.PersistentSession session) throws PersistentException {
        try {
            shoppingcart.ShoppingCart shoppingCart = shoppingCart_item.getShoppingCart();
            if (shoppingCart_item.getShoppingCart() != null) {
                shoppingCart_item.getShoppingCart().shoppingCart_item.remove(shoppingCart_item);
            }
            shoppingCart_item.setORM_ShoppingCart(shoppingCart);

            productos.Item item = shoppingCart_item.getItem();
            if (shoppingCart_item.getItem() != null) {
                shoppingCart_item.getItem().shoppingCart_item.remove(shoppingCart_item);
            }
            shoppingCart_item.setORM_Item(item);

            try {
                session.delete(shoppingCart_item);
                return true;
            } catch (Exception e) {
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static boolean refresh(shoppingcart.ShoppingCart_item shoppingCart_item) throws PersistentException {
        try {
            login.PetStorePersistentManager.instance().getSession().refresh(shoppingCart_item);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static boolean evict(shoppingcart.ShoppingCart_item shoppingCart_item) throws PersistentException {
        try {
            login.PetStorePersistentManager.instance().getSession().evict(shoppingCart_item);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static ShoppingCart_item loadShoppingCart_itemByCriteria(ShoppingCart_itemCriteria shoppingCart_itemCriteria) {
        ShoppingCart_item[] shoppingCart_items = listShoppingCart_itemByCriteria(shoppingCart_itemCriteria);
        if (shoppingCart_items == null || shoppingCart_items.length == 0) {
            return null;
        }
        return shoppingCart_items[0];
    }

    public static ShoppingCart_item[] listShoppingCart_itemByCriteria(ShoppingCart_itemCriteria shoppingCart_itemCriteria) {
        return shoppingCart_itemCriteria.listShoppingCart_item();
    }
}
