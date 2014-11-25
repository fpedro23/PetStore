package productos;

import org.orm.PersistentException;

/**
 * Created by Pedro on 23/11/14.
 */
public class ProductosAD {

    public Categoria[] listarCategorias() throws PersistentException {
        try {
            Categoria[] listaCategorias = productos.CategoriaDAO.listCategoriaByQuery(null, null);
            System.out.printf("%d record(s) retrieved.%n", listaCategorias.length);
            return listaCategorias;
        } finally {
            System.out.println("Cerrando Conexion");
            login.PetStorePersistentManager.instance().disposePersistentManager();
        }

    }

    public Producto[] listarProductosDeCategoria(String nombreCategoria) throws PersistentException {
        try {
            Categoria categoria = CategoriaDAO.getCategoriaByORMID(nombreCategoria);
            System.out.println("Nombre Categoria " + categoria.getNombreCategoria());

            for (Producto producto : categoria.producto.toArray()) {
                System.out.println("Nombre Producto: " + producto.getNombreProducto());
            }
            return categoria.producto.toArray();
        } finally {
            System.out.println("Cerrando Conexion");
            login.PetStorePersistentManager.instance().disposePersistentManager();
        }

    }

    public Producto[] buscarProducto(String nombreProducto) throws PersistentException {
        try {
            ProductoCriteria productoCriteria = new ProductoCriteria();
            // Please uncomment the follow line and fill in parameter(s)
            productoCriteria.nombreProducto.like("%" + nombreProducto + "%");


            Producto[] listaProductos;
            listaProductos = ProductoDAO.listProductoByCriteria(productoCriteria);

            for (Producto producto : listaProductos) {
                System.out.println("Nombre Producto: " + producto.getNombreProducto());
            }

            return listaProductos;
        } finally {
            System.out.println("Cerrando Conexion");
            login.PetStorePersistentManager.instance().disposePersistentManager();
        }

    }


    public Item[] listarItemsDeProducto(String nombreProducto, String nombreCategoria) throws PersistentException {
        try {
            Categoria categoria = CategoriaDAO.getCategoriaByORMID(nombreCategoria);
            for (Producto producto : categoria.producto.toArray())
                if (producto.getNombreProducto().equalsIgnoreCase(nombreProducto)) {
                    System.out.println("Nombre Producto " + producto.getNombreProducto());
                    for (Item item : producto.item.toArray()) {
                        System.out.println("Nombre Item: " + item.getNombreItem());
                    }
                    return producto.item.toArray();
                } else {
                    return null;
                }
            return null;
        } finally {
            System.out.println("Cerrando Conexion");
            login.PetStorePersistentManager.instance().disposePersistentManager();
        }
    }

    public Item findItem(int idItem) throws PersistentException {
        Item item = ItemDAO.getItemByORMID(idItem);
        return item;
    }

}



