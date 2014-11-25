package servletsPetStore;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.SessionAware;
import org.orm.PersistentException;
import productos.Item;
import productos.ItemDAO;
import shoppingcart.ShoppingCart;
import shoppingcart.ShoppingCart_item;

import java.util.Map;

/**
 * Created by Pedro on 24/11/14.
 */
public class ServletShoppingCart extends ActionSupport implements SessionAware {
    private Map<String, Object> sessionMap;
    private Map<String, Object> requestMap;
    private int itemID;
    public Item item;


    public String addItemToCart() throws PersistentException {
        item = ItemDAO.getItemByORMID(itemID);
        System.out.println(item.getNombreItem());
        ShoppingCart cart;
        ShoppingCart_item shoppingCartItem = new ShoppingCart_item();
        shoppingCartItem.setItem(item);
        cart = (ShoppingCart) sessionMap.get("cart");

        if (cart == null) {
            cart = new ShoppingCart();
            sessionMap.put("cart", cart);
            cart.shoppingCart_item.add(shoppingCartItem);

        } else {

            cart.shoppingCart_item.add(shoppingCartItem);

        }


        return "success";
    }


    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    @Override
    public void setSession(Map<String, Object> stringObjectMap) {
        this.sessionMap = stringObjectMap;
    }
}
