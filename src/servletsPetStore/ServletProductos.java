package servletsPetStore;

import com.opensymphony.xwork2.ActionSupport;
import org.orm.PersistentException;
import productos.*;

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
    public int idItem;
    public String mensajeResultado;

    public String listCategories() throws PersistentException {
        ProductosADFactory factory = new ProductosADFactory();
        ProductosADInterface productosADInterface;

        productosADInterface = factory.getProductosAD("PRODUCTOAD");
        listaCategorias = productosADInterface.listarCategorias();

        if (listaCategorias == null) {
            mensajeResultado = "Error, no se encontró ningun producto.";
            return "error";
        } else {
            return "success";
        }

    }

    public String listProductsFromCategory() throws PersistentException {
        ProductosADFactory factory = new ProductosADFactory();
        ProductosADInterface productosADInterface;
        productosADInterface = factory.getProductosAD("PRODUCTOAD");
        listaProductos = productosADInterface.listarProductosDeCategoria(nombreCategoria);
        if (listaProductos == null) {
            mensajeResultado = "Error, no se encontró ningun producto.";
            return "error";
        } else {
            return "success";
        }
    }

    public String listItemsFromProduct() throws PersistentException {
        ProductosADFactory factory = new ProductosADFactory();
        ProductosADInterface productosADInterface;
        productosADInterface = factory.getProductosAD("PRODUCTOAD");
        listaItems = productosADInterface.listarItemsDeProducto(nombreProducto, nombreCategoria);
        if (listaItems == null) {
            mensajeResultado = "Error, no se encontró ningun producto.";
            return "error";
        } else {
            return "success";
        }
    }

    public String findProductByName() throws PersistentException {
        ProductosADFactory factory = new ProductosADFactory();
        ProductosADInterface productosADInterface;
        productosADInterface = factory.getProductosAD("PRODUCTOAD");
        listaProductos = productosADInterface.buscarProducto(nombreProducto);
        if (listaProductos == null) {
            mensajeResultado = "Error, no se encontró ningun producto.";
            return "error";
        } else {
            return "success";
        }
    }

    public String findItemByID() throws PersistentException {
        ProductosADFactory factory = new ProductosADFactory();
        ProductosADInterface productosADInterface;
        productosADInterface = factory.getProductosAD("PRODUCTOAD");
        item = productosADInterface.findItem(idItem);
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
