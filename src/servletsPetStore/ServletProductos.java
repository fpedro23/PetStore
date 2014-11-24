package servletsPetStore;

import com.opensymphony.xwork2.ActionSupport;
import org.orm.PersistentException;
import productos.Categoria;
import productos.Item;
import productos.Producto;
import productos.ProductosAD;

/**
 * Created by Pedro on 23/11/14.
 */
public class ServletProductos extends ActionSupport {
    public Categoria[] listaCategorias;
    public Producto[] listaProductos;
    public Item[] listaItems;
    public String nombreCategoria;
    public String nombreProducto;

    public String listCategories() throws PersistentException {
        ProductosAD productosAD;

        productosAD = new ProductosAD();
        listaCategorias = productosAD.listarCategorias();
        return "success";
    }

    public String listProductsFromCategory() throws PersistentException {
        ProductosAD productosAD;

        productosAD = new ProductosAD();
        listaProductos = productosAD.listarProductosDeCategoria(nombreCategoria);
        return "success";
    }

    public String listItemsFromProduct() throws PersistentException {
        ProductosAD productosAD;

        productosAD = new ProductosAD();
        listaItems = productosAD.listarItemsDeProducto(nombreProducto, nombreCategoria);
        return "success";
    }

    public String findProductByName() throws PersistentException {
        ProductosAD productosAD;
        productosAD = new ProductosAD();
        listaProductos = productosAD.buscarProducto(nombreProducto);
        return "success";
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }
}
