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

public class Producto {
    org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
        public java.util.Set getSet(int key) {
            return this_getSet(key);
        }

        public void setOwner(Object owner, int key) {
            this_setOwner(owner, key);
        }

    };
    public final productos.ItemSetCollection item = new productos.ItemSetCollection(this, _ormAdapter, login.ORMConstants.KEY_PRODUCTO_ITEM, login.ORMConstants.KEY_ITEM_PRODUCTOS, login.ORMConstants.KEY_MUL_ONE_TO_MANY);
    private int id;
    private Integer nombreProducto;
    private productos.Categoria categorias;
    private java.util.Set ORM_item = new java.util.HashSet();

    public Producto() {
    }

    private java.util.Set this_getSet(int key) {
        if (key == login.ORMConstants.KEY_PRODUCTO_ITEM) {
            return ORM_item;
        }

        return null;
    }

    private void this_setOwner(Object owner, int key) {
        if (key == login.ORMConstants.KEY_PRODUCTO_CATEGORIAS) {
            this.categorias = (productos.Categoria) owner;
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

    public void setNombreProducto(int value) {
        setNombreProducto(new Integer(value));
    }

    public Integer getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(Integer value) {
        this.nombreProducto = value;
    }

    public productos.Categoria getCategorias() {
        return categorias;
    }

    public void setCategorias(productos.Categoria value) {
        if (categorias != null) {
            categorias.producto.remove(this);
        }
        if (value != null) {
            value.producto.add(this);
        }
    }

    private productos.Categoria getORM_Categorias() {
        return categorias;
    }

    /**
     * This method is for internal use only.
     */
    public void setORM_Categorias(productos.Categoria value) {
        this.categorias = value;
    }

    private java.util.Set getORM_Item() {
        return ORM_item;
    }

    private void setORM_Item(java.util.Set value) {
        this.ORM_item = value;
    }

    public String toString() {
        return String.valueOf(getId());
    }

}
