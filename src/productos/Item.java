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
package productos;

public class Item {
    org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
        public java.util.Set getSet(int key) {
            return this_getSet(key);
        }

        public void setOwner(Object owner, int key) {
            this_setOwner(owner, key);
        }

    };
    public final shoppingcart.ShoppingCart_itemSetCollection shoppingCart_item = new shoppingcart.ShoppingCart_itemSetCollection(this, _ormAdapter, login.ORMConstants.KEY_ITEM_SHOPPINGCART_ITEM, login.ORMConstants.KEY_SHOPPINGCART_ITEM_ITEM, login.ORMConstants.KEY_MUL_ONE_TO_MANY);
    private int id;
    private String nombreItem;
    private Integer precio;
    private productos.Producto productos;
    private java.util.Set ORM_shoppingCart_item = new java.util.HashSet();

    public Item() {
    }

    private java.util.Set this_getSet(int key) {
        if (key == login.ORMConstants.KEY_ITEM_SHOPPINGCART_ITEM) {
            return ORM_shoppingCart_item;
        }

        return null;
    }

    private void this_setOwner(Object owner, int key) {
        if (key == login.ORMConstants.KEY_ITEM_PRODUCTOS) {
            this.productos = (productos.Producto) owner;
        }
    }

    public int getId() {
        return id;
    }

    private void setId(int value) {
        this.id = value;
    }

    public int getORMID() {
        return getId();
    }

    public String getNombreItem() {
        return nombreItem;
    }

    public void setNombreItem(String value) {
        this.nombreItem = value;
    }

    public void setPrecio(int value) {
        setPrecio(new Integer(value));
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer value) {
        this.precio = value;
    }

    public productos.Producto getProductos() {
        return productos;
    }

    public void setProductos(productos.Producto value) {
        if (productos != null) {
            productos.item.remove(this);
        }
        if (value != null) {
            value.item.add(this);
        }
    }

    private productos.Producto getORM_Productos() {
        return productos;
    }

    /**
     * This method is for internal use only.
     */
    public void setORM_Productos(productos.Producto value) {
        this.productos = value;
    }

    private java.util.Set getORM_ShoppingCart_item() {
        return ORM_shoppingCart_item;
    }

    private void setORM_ShoppingCart_item(java.util.Set value) {
        this.ORM_shoppingCart_item = value;
    }

    public String toString() {
        return String.valueOf(getId());
    }

}
