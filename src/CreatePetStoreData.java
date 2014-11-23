/**
 * Licensee: 
 * License Type: Evaluation
 */

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

public class CreatePetStoreData {
    public static void main(String[] args) {
        try {
            CreatePetStoreData createPetStoreData = new CreatePetStoreData();
            try {
                createPetStoreData.createTestData();
            } finally {
                login.PetStorePersistentManager.instance().disposePersistentManager();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void createTestData() throws PersistentException {
        PersistentTransaction t = login.PetStorePersistentManager.instance().getSession().beginTransaction();
        try {


            productos.Categoria lproductosCategoria = productos.CategoriaDAO.createCategoria();
            productos.Producto lproductosProducto = productos.ProductoDAO.createProducto();
            productos.Item lproductosItem = productos.ItemDAO.createItem();


            // TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : producto
            lproductosCategoria.setNombreCategoria(1);
            lproductosProducto.setCategorias(lproductosCategoria);
            lproductosProducto.setNombreProducto(12);


            lproductosCategoria.producto.add(lproductosProducto);

            lproductosItem.setNombreItem("Item 1");
            lproductosItem.setProductos(lproductosProducto);


            productos.CategoriaDAO.save(lproductosCategoria);
            productos.ProductoDAO.save(lproductosProducto);
            productos.ItemDAO.save(lproductosItem);


            // TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : item, categorias
            // TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : shoppingCart_item, productos

            t.commit();
        } catch (Exception e) {
            t.rollback();
        }

    }
}
