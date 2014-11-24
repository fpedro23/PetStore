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

public class ProductoDAO {
    public static Producto loadProductoByORMID(String nombreProducto, productos.Categoria categorias) throws PersistentException {
        try {
            PersistentSession session = login.PetStorePersistentManager.instance().getSession();
            return loadProductoByORMID(session, nombreProducto, categorias);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Producto getProductoByORMID(String nombreProducto, productos.Categoria categorias) throws PersistentException {
        try {
            PersistentSession session = login.PetStorePersistentManager.instance().getSession();
            return getProductoByORMID(session, nombreProducto, categorias);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Producto loadProductoByORMID(String nombreProducto, productos.Categoria categorias, org.hibernate.LockMode lockMode) throws PersistentException {
        try {
            PersistentSession session = login.PetStorePersistentManager.instance().getSession();
            return loadProductoByORMID(session, nombreProducto, categorias, lockMode);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Producto getProductoByORMID(String nombreProducto, productos.Categoria categorias, org.hibernate.LockMode lockMode) throws PersistentException {
        try {
            PersistentSession session = login.PetStorePersistentManager.instance().getSession();
            return getProductoByORMID(session, nombreProducto, categorias, lockMode);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Producto loadProductoByORMID(PersistentSession session, String nombreProducto, productos.Categoria categorias) throws PersistentException {
        try {
            Producto producto = new productos.Producto();
            producto.setNombreProducto(nombreProducto);
            producto.setORM_Categorias(categorias);

            return (Producto) session.load(productos.Producto.class, producto);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Producto getProductoByORMID(PersistentSession session, String nombreProducto, productos.Categoria categorias) throws PersistentException {
        try {
            Producto producto = new productos.Producto();
            producto.setNombreProducto(nombreProducto);
            producto.setORM_Categorias(categorias);

            return (Producto) session.get(productos.Producto.class, producto);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Producto loadProductoByORMID(PersistentSession session, String nombreProducto, productos.Categoria categorias, org.hibernate.LockMode lockMode) throws PersistentException {
        try {
            Producto producto = new productos.Producto();
            producto.setNombreProducto(nombreProducto);
            producto.setORM_Categorias(categorias);

            return (Producto) session.load(productos.Producto.class, producto, lockMode);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Producto getProductoByORMID(PersistentSession session, String nombreProducto, productos.Categoria categorias, org.hibernate.LockMode lockMode) throws PersistentException {
        try {
            Producto producto = new productos.Producto();
            producto.setNombreProducto(nombreProducto);
            producto.setORM_Categorias(categorias);

            return (Producto) session.get(productos.Producto.class, producto, lockMode);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static List queryProducto(String condition, String orderBy) throws PersistentException {
        try {
            PersistentSession session = login.PetStorePersistentManager.instance().getSession();
            return queryProducto(session, condition, orderBy);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static List queryProducto(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
        try {
            PersistentSession session = login.PetStorePersistentManager.instance().getSession();
            return queryProducto(session, condition, orderBy, lockMode);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Producto[] listProductoByQuery(String condition, String orderBy) throws PersistentException {
        try {
            PersistentSession session = login.PetStorePersistentManager.instance().getSession();
            return listProductoByQuery(session, condition, orderBy);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Producto[] listProductoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
        try {
            PersistentSession session = login.PetStorePersistentManager.instance().getSession();
            return listProductoByQuery(session, condition, orderBy, lockMode);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static List queryProducto(PersistentSession session, String condition, String orderBy) throws PersistentException {
        StringBuffer sb = new StringBuffer("From productos.Producto as Producto");
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

    public static List queryProducto(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
        StringBuffer sb = new StringBuffer("From productos.Producto as Producto");
        if (condition != null)
            sb.append(" Where ").append(condition);
        if (orderBy != null)
            sb.append(" Order By ").append(orderBy);
        try {
            Query query = session.createQuery(sb.toString());
            query.setLockMode("Producto", lockMode);
            return query.list();
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Producto[] listProductoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
        try {
            List list = queryProducto(session, condition, orderBy);
            return (Producto[]) list.toArray(new Producto[list.size()]);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Producto[] listProductoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
        try {
            List list = queryProducto(session, condition, orderBy, lockMode);
            return (Producto[]) list.toArray(new Producto[list.size()]);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Producto loadProductoByQuery(String condition, String orderBy) throws PersistentException {
        try {
            PersistentSession session = login.PetStorePersistentManager.instance().getSession();
            return loadProductoByQuery(session, condition, orderBy);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Producto loadProductoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
        try {
            PersistentSession session = login.PetStorePersistentManager.instance().getSession();
            return loadProductoByQuery(session, condition, orderBy, lockMode);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Producto loadProductoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
        Producto[] productos = listProductoByQuery(session, condition, orderBy);
        if (productos != null && productos.length > 0)
            return productos[0];
        else
            return null;
    }

    public static Producto loadProductoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
        Producto[] productos = listProductoByQuery(session, condition, orderBy, lockMode);
        if (productos != null && productos.length > 0)
            return productos[0];
        else
            return null;
    }

    public static java.util.Iterator iterateProductoByQuery(String condition, String orderBy) throws PersistentException {
        try {
            PersistentSession session = login.PetStorePersistentManager.instance().getSession();
            return iterateProductoByQuery(session, condition, orderBy);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static java.util.Iterator iterateProductoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
        try {
            PersistentSession session = login.PetStorePersistentManager.instance().getSession();
            return iterateProductoByQuery(session, condition, orderBy, lockMode);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static java.util.Iterator iterateProductoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
        StringBuffer sb = new StringBuffer("From productos.Producto as Producto");
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

    public static java.util.Iterator iterateProductoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
        StringBuffer sb = new StringBuffer("From productos.Producto as Producto");
        if (condition != null)
            sb.append(" Where ").append(condition);
        if (orderBy != null)
            sb.append(" Order By ").append(orderBy);
        try {
            Query query = session.createQuery(sb.toString());
            query.setLockMode("Producto", lockMode);
            return query.iterate();
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Producto createProducto() {
        return new productos.Producto();
    }

    public static boolean save(productos.Producto producto) throws PersistentException {
        try {
            login.PetStorePersistentManager.instance().saveObject(producto);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static boolean delete(productos.Producto producto) throws PersistentException {
        try {
            login.PetStorePersistentManager.instance().deleteObject(producto);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static boolean deleteAndDissociate(productos.Producto producto) throws PersistentException {
        try {
            productos.Categoria categorias = producto.getCategorias();
            if (producto.getCategorias() != null) {
                producto.getCategorias().producto.remove(producto);
            }
            producto.setORM_Categorias(categorias);

            productos.Item[] lItems = producto.item.toArray();
            for (int i = 0; i < lItems.length; i++) {
                lItems[i].setProductos(null);
            }
            return delete(producto);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static boolean deleteAndDissociate(productos.Producto producto, org.orm.PersistentSession session) throws PersistentException {
        try {
            productos.Categoria categorias = producto.getCategorias();
            if (producto.getCategorias() != null) {
                producto.getCategorias().producto.remove(producto);
            }
            producto.setORM_Categorias(categorias);

            productos.Item[] lItems = producto.item.toArray();
            for (int i = 0; i < lItems.length; i++) {
                lItems[i].setProductos(null);
            }
            try {
                session.delete(producto);
                return true;
            } catch (Exception e) {
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static boolean refresh(productos.Producto producto) throws PersistentException {
        try {
            login.PetStorePersistentManager.instance().getSession().refresh(producto);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static boolean evict(productos.Producto producto) throws PersistentException {
        try {
            login.PetStorePersistentManager.instance().getSession().evict(producto);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Producto loadProductoByCriteria(ProductoCriteria productoCriteria) {
        Producto[] productos = listProductoByCriteria(productoCriteria);
        if (productos == null || productos.length == 0) {
            return null;
        }
        return productos[0];
    }

    public static Producto[] listProductoByCriteria(ProductoCriteria productoCriteria) {
        return productoCriteria.listProducto();
    }
}
