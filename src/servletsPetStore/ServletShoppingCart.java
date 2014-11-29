package servletsPetStore;

import com.opensymphony.xwork2.ActionSupport;
import login.UsuarioDAO;
import org.apache.struts2.interceptor.SessionAware;
import org.orm.PersistentException;
import productos.*;
import shoppingcart.ShoppingCart;
import shoppingcart.ShoppingCart_item;

import java.util.Map;

/**
 * Created by Pedro on 24/11/14.
 */
public class ServletShoppingCart extends ActionSupport implements SessionAware {
    public Item item;
    public String mensajeResultado;
    public String mensajeSubResultado;
    private Map<String, Object> sessionMap;
    private Map<String, Object> requestMap;
    private int itemID;
    private int cantidad;

    public String addItemToCart() throws PersistentException {
        item = ItemDAO.getItemByORMID(itemID);
        System.out.println(item.getNombreItem());
        ShoppingCart cart;
        ShoppingCart_item shoppingCartItem = new ShoppingCart_item();
        shoppingCartItem.setItem(item);
        cart = (ShoppingCart) sessionMap.get("cart");
        shoppingCartItem.setCantidad(cantidad);
        if (cart == null) {
            cart = new ShoppingCart();
            sessionMap.put("cart", cart);
            cart.shoppingCart_item.add(shoppingCartItem);

        } else {

            cart.shoppingCart_item.add(shoppingCartItem);

        }


        return "success";
    }

    public String placeOrder() throws PersistentException {
        ShoppingCart cart;
        cart = (ShoppingCart) sessionMap.get("cart");
        ProductosADInterface productosADInterface;

        if (sessionMap.containsKey("nombreUsuario")) {
            String nombreUsuario = (String) sessionMap.get("nombreUsuario");
            System.out.println("Nombre de usuario para carro: " + nombreUsuario);
            cart.setUsuarioemail(UsuarioDAO.getUsuarioByORMID(nombreUsuario));
            int subtotal = 0;

            for (ShoppingCart_item shoppingCart_item : cart.shoppingCart_item.toArray()) {
                subtotal = subtotal + shoppingCart_item.getItem().getPrecio() * shoppingCart_item.getCantidad();
            }


            cart.setSubTotal(subtotal);
            cart.setTotal(subtotal);
            ProductosADFactory factory = new ProductosADFactory();
            productosADInterface = factory.getProductosAD("PRODUCTOAD");
            mensajeResultado = "Felicidades, orden aceptada.";
            mensajeSubResultado = "Tu ordén estará disponible en 3 días";
            return "success";
        } else {
            return "needLogin";
        }


    }


    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public void setSession(Map<String, Object> stringObjectMap) {
        this.sessionMap = stringObjectMap;
    }
}
