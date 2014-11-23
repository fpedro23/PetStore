package servletsPetStore;

import com.opensymphony.xwork2.ActionSupport;
import org.orm.PersistentException;
import productos.Categoria;
import productos.ProductosAD;

/**
 * Created by Pedro on 23/11/14.
 */
public class ServletProductos extends ActionSupport {
    public Categoria[] listaCategorias;

    public String listCategories() throws PersistentException {
        ProductosAD productosAD;

        productosAD = new ProductosAD();
        listaCategorias = productosAD.listarCategorias();
        return "success";
    }

}
