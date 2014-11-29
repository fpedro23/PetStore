package productos;

import org.orm.PersistentException;
import shoppingcart.ShoppingCart;

/**
 * Created by Pedro on 28/11/14.
 */
public interface ProductosADInterface {
    Categoria[] listarCategorias() throws PersistentException;

    Producto[] listarProductosDeCategoria(String nombreCategoria) throws PersistentException;

    Producto[] buscarProducto(String nombreProducto) throws PersistentException;

    Item[] listarItemsDeProducto(String nombreProducto, String nombreCategoria) throws PersistentException;

    Item findItem(int idItem) throws PersistentException;

    void placeOrder(ShoppingCart cart) throws PersistentException;

}
