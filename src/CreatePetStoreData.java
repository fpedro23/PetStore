/**
 * Licensee: 
 * License Type: Evaluation
 */

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

public class CreatePetStoreData {
    public void createTestData() throws PersistentException {
        PersistentTransaction t = login.PetStorePersistentManager.instance().getSession().beginTransaction();
        try {

            productos.Categoria lproductosCategoria = productos.CategoriaDAO.createCategoria();
            lproductosCategoria.setNombreCategoria("Gatos");
            // TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : producto

            productos.Producto lproductosProducto = productos.ProductoDAO.createProducto();
            lproductosProducto.setNombreProducto("Collar");
            lproductosCategoria.producto.add(lproductosProducto);

            // TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : item, categorias
            productos.Item lproductosItem = productos.ItemDAO.createItem();
            lproductosItem.setNombreItem("Azul");
            lproductosProducto.item.add(lproductosItem);
            // TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : shoppingCart_item, productos

            productos.CategoriaDAO.save(lproductosCategoria);
            productos.ProductoDAO.save(lproductosProducto);
            productos.ItemDAO.save(lproductosItem);


            t.commit();
        } catch (Exception e) {
            t.rollback();
        }

    }

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
}
