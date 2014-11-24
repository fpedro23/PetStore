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
    public Item item;
    public String nombreCategoria;
    public String nombreProducto;
    public String mensajeResultado;
    public int idItem;


    public String listCategories() throws PersistentException {
        ProductosAD productosAD;

        productosAD = new ProductosAD();
        listaCategorias = productosAD.listarCategorias();

        if (listaCategorias == null) {
            mensajeResultado = "Error, no se encontró ningun producto.";
            return "error";
        } else {
            return "success";
        }

    }

    public String listProductsFromCategory() throws PersistentException {
        ProductosAD productosAD;

        productosAD = new ProductosAD();
        listaProductos = productosAD.listarProductosDeCategoria(nombreCategoria);
        if (listaProductos == null) {
            mensajeResultado = "Error, no se encontró ningun producto.";
            return "error";
        } else {
            return "success";
        }
    }

    public String listItemsFromProduct() throws PersistentException {
        ProductosAD productosAD;

        productosAD = new ProductosAD();
        listaItems = productosAD.listarItemsDeProducto(nombreProducto, nombreCategoria);
        if (listaItems == null) {
            mensajeResultado = "Error, no se encontró ningun producto.";
            return "error";
        } else {
            return "success";
        }
    }

    public String findProductByName() throws PersistentException {
        ProductosAD productosAD;
        productosAD = new ProductosAD();
        listaProductos = productosAD.buscarProducto(nombreProducto);
        if (listaProductos == null) {
            mensajeResultado = "Error, no se encontró ningun producto.";
            return "error";
        } else {
            return "success";
        }
    }

    public String findItemByID() throws PersistentException {
        ProductosAD productosAD;
        productosAD = new ProductosAD();
        item = productosAD.findItem(idItem);
        if (item == null) {
            mensajeResultado = "Error, no se encontró ningun Item.";
            return "error";
        } else {
            return "success";
        }
    }


    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }
}
