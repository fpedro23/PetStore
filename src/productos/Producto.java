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

import java.io.Serializable;

public class Producto implements Serializable {
    public Producto() {
    }

    public boolean equals(Object aObj) {
        if (aObj == this)
            return true;
        if (!(aObj instanceof Producto))
            return false;
        Producto producto = (Producto) aObj;
        if ((getNombreProducto() != null && !getNombreProducto().equals(producto.getNombreProducto())) || (getNombreProducto() == null && producto.getNombreProducto() != null))
            return false;
        if (getCategorias() == null) {
            if (producto.getCategorias() != null)
                return false;
        } else if (!getCategorias().equals(producto.getCategorias()))
            return false;
        return true;
    }

    public int hashCode() {
        int hashcode = 0;
        hashcode = hashcode + (getNombreProducto() == null ? 0 : getNombreProducto().hashCode());
        if (getCategorias() != null) {
            hashcode = hashcode + (getCategorias().getORMID() == null ? 0 : getCategorias().getORMID().hashCode());
        }
        return hashcode;
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

    org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
        public java.util.Set getSet(int key) {
            return this_getSet(key);
        }

        public void setOwner(Object owner, int key) {
            this_setOwner(owner, key);
        }

    };

    private String nombreProducto;

    private productos.Categoria categorias;

    private String categoriasId;

    private void setCategoriasId(String value) {
        this.categoriasId = value;
    }

    public String getCategoriasId() {
        return categoriasId;
    }

    private java.util.Set ORM_item = new java.util.HashSet();

    public void setNombreProducto(String value) {
        this.nombreProducto = value;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setCategorias(productos.Categoria value) {
        if (categorias != null) {
            categorias.producto.remove(this);
        }
        if (value != null) {
            value.producto.add(this);
        }
    }

    public productos.Categoria getCategorias() {
        return categorias;
    }

    /**
     * This method is for internal use only.
     */
    public void setORM_Categorias(productos.Categoria value) {
        this.categorias = value;
    }

    private productos.Categoria getORM_Categorias() {
        return categorias;
    }

    private void setORM_Item(java.util.Set value) {
        this.ORM_item = value;
    }

    private java.util.Set getORM_Item() {
        return ORM_item;
    }

    public final productos.ItemSetCollection item = new productos.ItemSetCollection(this, _ormAdapter, login.ORMConstants.KEY_PRODUCTO_ITEM, login.ORMConstants.KEY_ITEM_PRODUCTOS, login.ORMConstants.KEY_MUL_ONE_TO_MANY);

    public String toString() {
        return String.valueOf(getNombreProducto() + " " + ((getCategorias() == null) ? "" : String.valueOf(getCategorias().getORMID())));
    }

}
