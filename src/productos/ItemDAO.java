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
package productos;

import org.hibernate.Query;
import org.orm.PersistentException;
import org.orm.PersistentSession;

import java.util.List;

public class ItemDAO {
    public static Item loadItemByORMID(int id) throws PersistentException {
        try {
            PersistentSession session = login.PetStorePersistentManager.instance().getSession();
            return loadItemByORMID(session, id);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Item getItemByORMID(int id) throws PersistentException {
        try {
            PersistentSession session = login.PetStorePersistentManager.instance().getSession();
            return getItemByORMID(session, id);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Item loadItemByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
        try {
            PersistentSession session = login.PetStorePersistentManager.instance().getSession();
            return loadItemByORMID(session, id, lockMode);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Item getItemByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
        try {
            PersistentSession session = login.PetStorePersistentManager.instance().getSession();
            return getItemByORMID(session, id, lockMode);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Item loadItemByORMID(PersistentSession session, int id) throws PersistentException {
        try {
            return (Item) session.load(productos.Item.class, new Integer(id));
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Item getItemByORMID(PersistentSession session, int id) throws PersistentException {
        try {
            return (Item) session.get(productos.Item.class, new Integer(id));
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Item loadItemByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
        try {
            return (Item) session.load(productos.Item.class, new Integer(id), lockMode);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Item getItemByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
        try {
            return (Item) session.get(productos.Item.class, new Integer(id), lockMode);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static List queryItem(String condition, String orderBy) throws PersistentException {
        try {
            PersistentSession session = login.PetStorePersistentManager.instance().getSession();
            return queryItem(session, condition, orderBy);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static List queryItem(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
        try {
            PersistentSession session = login.PetStorePersistentManager.instance().getSession();
            return queryItem(session, condition, orderBy, lockMode);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Item[] listItemByQuery(String condition, String orderBy) throws PersistentException {
        try {
            PersistentSession session = login.PetStorePersistentManager.instance().getSession();
            return listItemByQuery(session, condition, orderBy);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Item[] listItemByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
        try {
            PersistentSession session = login.PetStorePersistentManager.instance().getSession();
            return listItemByQuery(session, condition, orderBy, lockMode);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static List queryItem(PersistentSession session, String condition, String orderBy) throws PersistentException {
        StringBuffer sb = new StringBuffer("From productos.Item as Item");
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

    public static List queryItem(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
        StringBuffer sb = new StringBuffer("From productos.Item as Item");
        if (condition != null)
            sb.append(" Where ").append(condition);
        if (orderBy != null)
            sb.append(" Order By ").append(orderBy);
        try {
            Query query = session.createQuery(sb.toString());
            query.setLockMode("Item", lockMode);
            return query.list();
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Item[] listItemByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
        try {
            List list = queryItem(session, condition, orderBy);
            return (Item[]) list.toArray(new Item[list.size()]);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Item[] listItemByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
        try {
            List list = queryItem(session, condition, orderBy, lockMode);
            return (Item[]) list.toArray(new Item[list.size()]);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Item loadItemByQuery(String condition, String orderBy) throws PersistentException {
        try {
            PersistentSession session = login.PetStorePersistentManager.instance().getSession();
            return loadItemByQuery(session, condition, orderBy);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Item loadItemByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
        try {
            PersistentSession session = login.PetStorePersistentManager.instance().getSession();
            return loadItemByQuery(session, condition, orderBy, lockMode);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Item loadItemByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
        Item[] items = listItemByQuery(session, condition, orderBy);
        if (items != null && items.length > 0)
            return items[0];
        else
            return null;
    }

    public static Item loadItemByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
        Item[] items = listItemByQuery(session, condition, orderBy, lockMode);
        if (items != null && items.length > 0)
            return items[0];
        else
            return null;
    }

    public static java.util.Iterator iterateItemByQuery(String condition, String orderBy) throws PersistentException {
        try {
            PersistentSession session = login.PetStorePersistentManager.instance().getSession();
            return iterateItemByQuery(session, condition, orderBy);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static java.util.Iterator iterateItemByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
        try {
            PersistentSession session = login.PetStorePersistentManager.instance().getSession();
            return iterateItemByQuery(session, condition, orderBy, lockMode);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static java.util.Iterator iterateItemByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
        StringBuffer sb = new StringBuffer("From productos.Item as Item");
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

    public static java.util.Iterator iterateItemByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
        StringBuffer sb = new StringBuffer("From productos.Item as Item");
        if (condition != null)
            sb.append(" Where ").append(condition);
        if (orderBy != null)
            sb.append(" Order By ").append(orderBy);
        try {
            Query query = session.createQuery(sb.toString());
            query.setLockMode("Item", lockMode);
            return query.iterate();
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Item createItem() {
        return new productos.Item();
    }

    public static boolean save(productos.Item item) throws PersistentException {
        try {
            login.PetStorePersistentManager.instance().saveObject(item);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static boolean delete(productos.Item item) throws PersistentException {
        try {
            login.PetStorePersistentManager.instance().deleteObject(item);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static boolean deleteAndDissociate(productos.Item item) throws PersistentException {
        try {
            if (item.getProductos() != null) {
                item.getProductos().item.remove(item);
            }

            shoppingcart.ShoppingCart_item[] lShoppingCart_items = item.shoppingCart_item.toArray();
            for (int i = 0; i < lShoppingCart_items.length; i++) {
                lShoppingCart_items[i].setItem(null);
            }
            return delete(item);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static boolean deleteAndDissociate(productos.Item item, org.orm.PersistentSession session) throws PersistentException {
        try {
            if (item.getProductos() != null) {
                item.getProductos().item.remove(item);
            }

            shoppingcart.ShoppingCart_item[] lShoppingCart_items = item.shoppingCart_item.toArray();
            for (int i = 0; i < lShoppingCart_items.length; i++) {
                lShoppingCart_items[i].setItem(null);
            }
            try {
                session.delete(item);
                return true;
            } catch (Exception e) {
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static boolean refresh(productos.Item item) throws PersistentException {
        try {
            login.PetStorePersistentManager.instance().getSession().refresh(item);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static boolean evict(productos.Item item) throws PersistentException {
        try {
            login.PetStorePersistentManager.instance().getSession().evict(item);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Item loadItemByCriteria(ItemCriteria itemCriteria) {
        Item[] items = listItemByCriteria(itemCriteria);
        if (items == null || items.length == 0) {
            return null;
        }
        return items[0];
    }

    public static Item[] listItemByCriteria(ItemCriteria itemCriteria) {
        return itemCriteria.listItem();
    }
}
