package productos;

import org.orm.PersistentException;

/**
 * Created by Pedro on 23/11/14.
 */
public class ProductosAD {

    public Categoria[] listarCategorias() throws PersistentException {
        Categoria[] listaCategorias = productos.CategoriaDAO.listCategoriaByQuery(null, null);
        System.out.printf("%d record(s) retrieved.%n", listaCategorias.length);
        return listaCategorias;
    }

}



