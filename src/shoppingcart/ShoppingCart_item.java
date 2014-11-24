/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 *
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 *
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: 
 * License Type: Evaluation
 */
package shoppingcart;

import java.io.Serializable;

public class ShoppingCart_item implements Serializable {
    public ShoppingCart_item() {
    }

    public boolean equals(Object aObj) {
        if (aObj == this)
            return true;
        if (!(aObj instanceof ShoppingCart_item))
            return false;
        ShoppingCart_item shoppingcart_item = (ShoppingCart_item) aObj;
        if (getShoppingCart() == null) {
            if (shoppingcart_item.getShoppingCart() != null)
                return false;
        } else if (!getShoppingCart().equals(shoppingcart_item.getShoppingCart()))
            return false;
        if (getItem() == null) {
            if (shoppingcart_item.getItem() != null)
                return false;
        } else if (!getItem().equals(shoppingcart_item.getItem()))
            return false;
        return true;
    }

    public int hashCode() {
        int hashcode = 0;
        if (getShoppingCart() != null) {
            hashcode = hashcode + (int) getShoppingCart().getORMID();
        }
        if (getItem() != null) {
            hashcode = hashcode + (int) getItem().getORMID();
        }
        return hashcode;
    }

    private void this_setOwner(Object owner, int key) {
        if (key == login.ORMConstants.KEY_SHOPPINGCART_ITEM_SHOPPINGCART) {
            this.shoppingCart = (shoppingcart.ShoppingCart) owner;
        } else if (key == login.ORMConstants.KEY_SHOPPINGCART_ITEM_ITEM) {
            this.item = (productos.Item) owner;
        }
    }

    org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
        public void setOwner(Object owner, int key) {
            this_setOwner(owner, key);
        }

    };

    private shoppingcart.ShoppingCart shoppingCart;

    private int shoppingCartId;

    private void setShoppingCartId(int value) {
        this.shoppingCartId = value;
    }

    public int getShoppingCartId() {
        return shoppingCartId;
    }

    private productos.Item item;

    private int itemId;

    private void setItemId(int value) {
        this.itemId = value;
    }

    public int getItemId() {
        return itemId;
    }

    private Integer cantidad;

    public void setCantidad(int value) {
        setCantidad(new Integer(value));
    }

    public void setCantidad(Integer value) {
        this.cantidad = value;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setShoppingCart(shoppingcart.ShoppingCart value) {
        if (shoppingCart != null) {
            shoppingCart.shoppingCart_item.remove(this);
        }
        if (value != null) {
            value.shoppingCart_item.add(this);
        }
    }

    public shoppingcart.ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    /**
     * This method is for internal use only.
     */
    public void setORM_ShoppingCart(shoppingcart.ShoppingCart value) {
        this.shoppingCart = value;
    }

    private shoppingcart.ShoppingCart getORM_ShoppingCart() {
        return shoppingCart;
    }

    public void setItem(productos.Item value) {
        if (item != null) {
            item.shoppingCart_item.remove(this);
        }
        if (value != null) {
            value.shoppingCart_item.add(this);
        }
    }

    public productos.Item getItem() {
        return item;
    }

    /**
     * This method is for internal use only.
     */
    public void setORM_Item(productos.Item value) {
        this.item = value;
    }

    private productos.Item getORM_Item() {
        return item;
    }

    public String toString() {
        return String.valueOf(((getShoppingCart() == null) ? "" : String.valueOf(getShoppingCart().getORMID())) + " " + ((getItem() == null) ? "" : String.valueOf(getItem().getORMID())));
    }

}
