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

public class CategoriaDAO {
    public static Categoria loadCategoriaByORMID(String nombreCategoria) throws PersistentException {
        try {
            PersistentSession session = login.PetStorePersistentManager.instance().getSession();
            return loadCategoriaByORMID(session, nombreCategoria);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Categoria getCategoriaByORMID(String nombreCategoria) throws PersistentException {
        try {
            PersistentSession session = login.PetStorePersistentManager.instance().getSession();
            return getCategoriaByORMID(session, nombreCategoria);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Categoria loadCategoriaByORMID(String nombreCategoria, org.hibernate.LockMode lockMode) throws PersistentException {
        try {
            PersistentSession session = login.PetStorePersistentManager.instance().getSession();
            return loadCategoriaByORMID(session, nombreCategoria, lockMode);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Categoria getCategoriaByORMID(String nombreCategoria, org.hibernate.LockMode lockMode) throws PersistentException {
        try {
            PersistentSession session = login.PetStorePersistentManager.instance().getSession();
            return getCategoriaByORMID(session, nombreCategoria, lockMode);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Categoria loadCategoriaByORMID(PersistentSession session, String nombreCategoria) throws PersistentException {
        try {
            return (Categoria) session.load(productos.Categoria.class, nombreCategoria);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Categoria getCategoriaByORMID(PersistentSession session, String nombreCategoria) throws PersistentException {
        try {
            return (Categoria) session.get(productos.Categoria.class, nombreCategoria);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Categoria loadCategoriaByORMID(PersistentSession session, String nombreCategoria, org.hibernate.LockMode lockMode) throws PersistentException {
        try {
            return (Categoria) session.load(productos.Categoria.class, nombreCategoria, lockMode);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Categoria getCategoriaByORMID(PersistentSession session, String nombreCategoria, org.hibernate.LockMode lockMode) throws PersistentException {
        try {
            return (Categoria) session.get(productos.Categoria.class, nombreCategoria, lockMode);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static List queryCategoria(String condition, String orderBy) throws PersistentException {
        try {
            PersistentSession session = login.PetStorePersistentManager.instance().getSession();
            return queryCategoria(session, condition, orderBy);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static List queryCategoria(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
        try {
            PersistentSession session = login.PetStorePersistentManager.instance().getSession();
            return queryCategoria(session, condition, orderBy, lockMode);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Categoria[] listCategoriaByQuery(String condition, String orderBy) throws PersistentException {
        try {
            PersistentSession session = login.PetStorePersistentManager.instance().getSession();
            return listCategoriaByQuery(session, condition, orderBy);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Categoria[] listCategoriaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
        try {
            PersistentSession session = login.PetStorePersistentManager.instance().getSession();
            return listCategoriaByQuery(session, condition, orderBy, lockMode);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static List queryCategoria(PersistentSession session, String condition, String orderBy) throws PersistentException {
        StringBuffer sb = new StringBuffer("From productos.Categoria as Categoria");
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

    public static List queryCategoria(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
        StringBuffer sb = new StringBuffer("From productos.Categoria as Categoria");
        if (condition != null)
            sb.append(" Where ").append(condition);
        if (orderBy != null)
            sb.append(" Order By ").append(orderBy);
        try {
            Query query = session.createQuery(sb.toString());
            query.setLockMode("Categoria", lockMode);
            return query.list();
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Categoria[] listCategoriaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
        try {
            List list = queryCategoria(session, condition, orderBy);
            return (Categoria[]) list.toArray(new Categoria[list.size()]);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Categoria[] listCategoriaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
        try {
            List list = queryCategoria(session, condition, orderBy, lockMode);
            return (Categoria[]) list.toArray(new Categoria[list.size()]);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Categoria loadCategoriaByQuery(String condition, String orderBy) throws PersistentException {
        try {
            PersistentSession session = login.PetStorePersistentManager.instance().getSession();
            return loadCategoriaByQuery(session, condition, orderBy);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Categoria loadCategoriaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
        try {
            PersistentSession session = login.PetStorePersistentManager.instance().getSession();
            return loadCategoriaByQuery(session, condition, orderBy, lockMode);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Categoria loadCategoriaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
        Categoria[] categorias = listCategoriaByQuery(session, condition, orderBy);
        if (categorias != null && categorias.length > 0)
            return categorias[0];
        else
            return null;
    }

    public static Categoria loadCategoriaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
        Categoria[] categorias = listCategoriaByQuery(session, condition, orderBy, lockMode);
        if (categorias != null && categorias.length > 0)
            return categorias[0];
        else
            return null;
    }

    public static java.util.Iterator iterateCategoriaByQuery(String condition, String orderBy) throws PersistentException {
        try {
            PersistentSession session = login.PetStorePersistentManager.instance().getSession();
            return iterateCategoriaByQuery(session, condition, orderBy);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static java.util.Iterator iterateCategoriaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
        try {
            PersistentSession session = login.PetStorePersistentManager.instance().getSession();
            return iterateCategoriaByQuery(session, condition, orderBy, lockMode);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static java.util.Iterator iterateCategoriaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
        StringBuffer sb = new StringBuffer("From productos.Categoria as Categoria");
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

    public static java.util.Iterator iterateCategoriaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
        StringBuffer sb = new StringBuffer("From productos.Categoria as Categoria");
        if (condition != null)
            sb.append(" Where ").append(condition);
        if (orderBy != null)
            sb.append(" Order By ").append(orderBy);
        try {
            Query query = session.createQuery(sb.toString());
            query.setLockMode("Categoria", lockMode);
            return query.iterate();
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Categoria createCategoria() {
        return new productos.Categoria();
    }

    public static boolean save(productos.Categoria categoria) throws PersistentException {
        try {
            login.PetStorePersistentManager.instance().saveObject(categoria);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static boolean delete(productos.Categoria categoria) throws PersistentException {
        try {
            login.PetStorePersistentManager.instance().deleteObject(categoria);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static boolean deleteAndDissociate(productos.Categoria categoria) throws PersistentException {
        try {
            productos.Producto[] lProductos = categoria.producto.toArray();
            for (int i = 0; i < lProductos.length; i++) {
                lProductos[i].setCategorias(null);
            }
            return delete(categoria);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static boolean deleteAndDissociate(productos.Categoria categoria, org.orm.PersistentSession session) throws PersistentException {
        try {
            productos.Producto[] lProductos = categoria.producto.toArray();
            for (int i = 0; i < lProductos.length; i++) {
                lProductos[i].setCategorias(null);
            }
            try {
                session.delete(categoria);
                return true;
            } catch (Exception e) {
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static boolean refresh(productos.Categoria categoria) throws PersistentException {
        try {
            login.PetStorePersistentManager.instance().getSession().refresh(categoria);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static boolean evict(productos.Categoria categoria) throws PersistentException {
        try {
            login.PetStorePersistentManager.instance().getSession().evict(categoria);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Categoria loadCategoriaByCriteria(CategoriaCriteria categoriaCriteria) {
        Categoria[] categorias = listCategoriaByCriteria(categoriaCriteria);
        if (categorias == null || categorias.length == 0) {
            return null;
        }
        return categorias[0];
    }

    public static Categoria[] listCategoriaByCriteria(CategoriaCriteria categoriaCriteria) {
        return categoriaCriteria.listCategoria();
    }
}
