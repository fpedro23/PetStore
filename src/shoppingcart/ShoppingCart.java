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

public class ShoppingCart {
    public ShoppingCart() {
    }

    private java.util.Set this_getSet(int key) {
        if (key == login.ORMConstants.KEY_SHOPPINGCART_SHOPPINGCART_ITEM) {
            return ORM_shoppingCart_item;
        }

        return null;
    }

    private void this_setOwner(Object owner, int key) {
        if (key == login.ORMConstants.KEY_SHOPPINGCART_USUARIOEMAIL) {
            this.usuarioemail = (login.Usuario) owner;
        }
    }

    org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
        public java.util.Set getSet(int key) {
            return this_getSet(key);
        }

        public void setOwner(Object owner, int key) {
            this_setOwner(owner, key);
        }

    };

    private int id;

    private Double subTotal;

    private Double total;

    private login.Usuario usuarioemail;

    private java.util.Set ORM_shoppingCart_item = new java.util.HashSet();

    private void setId(int value) {
        this.id = value;
    }

    public int getId() {
        return id;
    }

    public int getORMID() {
        return getId();
    }

    public void setSubTotal(double value) {
        setSubTotal(new Double(value));
    }

    public void setSubTotal(Double value) {
        this.subTotal = value;
    }

    public Double getSubTotal() {
        return subTotal;
    }

    public void setTotal(double value) {
        setTotal(new Double(value));
    }

    public void setTotal(Double value) {
        this.total = value;
    }

    public Double getTotal() {
        return total;
    }

    public void setUsuarioemail(login.Usuario value) {
        if (usuarioemail != null) {
            usuarioemail.shoppingCart.remove(this);
        }
        if (value != null) {
            value.shoppingCart.add(this);
        }
    }

    public login.Usuario getUsuarioemail() {
        return usuarioemail;
    }

    /**
     * This method is for internal use only.
     */
    public void setORM_Usuarioemail(login.Usuario value) {
        this.usuarioemail = value;
    }

    private login.Usuario getORM_Usuarioemail() {
        return usuarioemail;
    }

    private void setORM_ShoppingCart_item(java.util.Set value) {
        this.ORM_shoppingCart_item = value;
    }

    private java.util.Set getORM_ShoppingCart_item() {
        return ORM_shoppingCart_item;
    }

    public final shoppingcart.ShoppingCart_itemSetCollection shoppingCart_item = new shoppingcart.ShoppingCart_itemSetCollection(this, _ormAdapter, login.ORMConstants.KEY_SHOPPINGCART_SHOPPINGCART_ITEM, login.ORMConstants.KEY_SHOPPINGCART_ITEM_SHOPPINGCART, login.ORMConstants.KEY_MUL_ONE_TO_MANY);

    public String toString() {
        return String.valueOf(getId());
    }

}
