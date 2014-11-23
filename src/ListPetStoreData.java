/**
 * Licensee: 
 * License Type: Evaluation
 */

import org.orm.PersistentException;

public class ListPetStoreData {
    private static final int ROW_COUNT = 100;

    public static void main(String[] args) {
        try {
            ListPetStoreData listPetStoreData = new ListPetStoreData();
            try {
                listPetStoreData.listTestData();
                //listPetStoreData.listByCriteria();
            } finally {
                login.PetStorePersistentManager.instance().disposePersistentManager();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void listTestData() throws PersistentException {

        System.out.println("Listing Categoria...");
        productos.Categoria[] productosCategorias = productos.CategoriaDAO.listCategoriaByQuery(null, null);
        int length = Math.min(productosCategorias.length, ROW_COUNT);

        System.out.println(productosCategorias[0].getNombreCategoria());
        System.out.println(productosCategorias[0].producto.toArray()[0].getNombreProducto());
        System.out.println(productosCategorias[0].producto.toArray()[0].item.toArray()[0].getNombreItem());

        System.out.println(length + " record(s) retrieved.");


    }

    public void listByCriteria() throws PersistentException {
        System.out.println("Listing Usuario by Criteria...");
        login.UsuarioCriteria lloginUsuarioCriteria = new login.UsuarioCriteria();
        // Please uncomment the follow line and fill in parameter(s)
        //lloginUsuarioCriteria.email.eq();
        lloginUsuarioCriteria.setMaxResults(ROW_COUNT);
        login.Usuario[] loginUsuarios = lloginUsuarioCriteria.listUsuario();
        int length = loginUsuarios == null ? 0 : Math.min(loginUsuarios.length, ROW_COUNT);
        for (int i = 0; i < length; i++) {
            System.out.println(loginUsuarios[i]);
        }
        System.out.println(length + " Usuario record(s) retrieved.");

        System.out.println("Listing Categoria by Criteria...");
        productos.CategoriaCriteria lproductosCategoriaCriteria = new productos.CategoriaCriteria();
        // Please uncomment the follow line and fill in parameter(s)
        //lproductosCategoriaCriteria.id.eq();
        lproductosCategoriaCriteria.setMaxResults(ROW_COUNT);
        productos.Categoria[] productosCategorias = lproductosCategoriaCriteria.listCategoria();
        length = productosCategorias == null ? 0 : Math.min(productosCategorias.length, ROW_COUNT);
        for (int i = 0; i < length; i++) {
            System.out.println(productosCategorias[i]);
        }
        System.out.println(length + " Categoria record(s) retrieved.");

        System.out.println("Listing Producto by Criteria...");
        productos.ProductoCriteria lproductosProductoCriteria = new productos.ProductoCriteria();
        // Please uncomment the follow line and fill in parameter(s)
        //lproductosProductoCriteria.id.eq();
        lproductosProductoCriteria.setMaxResults(ROW_COUNT);
        productos.Producto[] productosProductos = lproductosProductoCriteria.listProducto();
        length = productosProductos == null ? 0 : Math.min(productosProductos.length, ROW_COUNT);
        for (int i = 0; i < length; i++) {
            System.out.println(productosProductos[i]);
        }
        System.out.println(length + " Producto record(s) retrieved.");

        System.out.println("Listing Item by Criteria...");
        productos.ItemCriteria lproductosItemCriteria = new productos.ItemCriteria();
        // Please uncomment the follow line and fill in parameter(s)
        //lproductosItemCriteria.id.eq();
        lproductosItemCriteria.setMaxResults(ROW_COUNT);
        productos.Item[] productosItems = lproductosItemCriteria.listItem();
        length = productosItems == null ? 0 : Math.min(productosItems.length, ROW_COUNT);
        for (int i = 0; i < length; i++) {
            System.out.println(productosItems[i]);
        }
        System.out.println(length + " Item record(s) retrieved.");

        System.out.println("Listing ShoppingCart by Criteria...");
        shoppingcart.ShoppingCartCriteria shoppingCartShoppingCartCriteria = new shoppingcart.ShoppingCartCriteria();
        // Please uncomment the follow line and fill in parameter(s)
        //shoppingCartShoppingCartCriteria.id.eq();
        shoppingCartShoppingCartCriteria.setMaxResults(ROW_COUNT);
        shoppingcart.ShoppingCart[] shoppingCartShoppingCarts = shoppingCartShoppingCartCriteria.listShoppingCart();
        length = shoppingCartShoppingCarts == null ? 0 : Math.min(shoppingCartShoppingCarts.length, ROW_COUNT);
        for (int i = 0; i < length; i++) {
            System.out.println(shoppingCartShoppingCarts[i]);
        }
        System.out.println(length + " ShoppingCart record(s) retrieved.");

        System.out.println("Listing ShoppingCart_item by Criteria...");
        shoppingcart.ShoppingCart_itemCriteria shoppingCartShoppingCart_itemCriteria = new shoppingcart.ShoppingCart_itemCriteria();
        // Please uncomment the follow line and fill in parameter(s)
        //productos.ItemCriteria shoppingCartShoppingCart_itemCriteria_Item = shoppingCartShoppingCart_itemCriteria.createItemCriteria();
        //shoppingCartShoppingCart_itemCriteria_Item.id.eq();
        shoppingCartShoppingCart_itemCriteria.setMaxResults(ROW_COUNT);
        shoppingcart.ShoppingCart_item[] shoppingCartShoppingCart_items = shoppingCartShoppingCart_itemCriteria.listShoppingCart_item();
        length = shoppingCartShoppingCart_items == null ? 0 : Math.min(shoppingCartShoppingCart_items.length, ROW_COUNT);
        for (int i = 0; i < length; i++) {
            System.out.println(shoppingCartShoppingCart_items[i]);
        }
        System.out.println(length + " ShoppingCart_item record(s) retrieved.");

    }
}
