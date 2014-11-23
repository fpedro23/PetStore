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

public class Categoria {
    org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
        public java.util.Set getSet(int key) {
            return this_getSet(key);
        }

    };
    public final productos.ProductoSetCollection producto = new productos.ProductoSetCollection(this, _ormAdapter, login.ORMConstants.KEY_CATEGORIA_PRODUCTO, login.ORMConstants.KEY_PRODUCTO_CATEGORIAS, login.ORMConstants.KEY_MUL_ONE_TO_MANY);
    private int id;
    private Integer nombreCategoria;
    private java.util.Set ORM_producto = new java.util.HashSet();

    public Categoria() {
    }

    private java.util.Set this_getSet(int key) {
        if (key == login.ORMConstants.KEY_CATEGORIA_PRODUCTO) {
            return ORM_producto;
        }

        return null;
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

    public void setNombreCategoria(int value) {
        setNombreCategoria(new Integer(value));
    }

    public Integer getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(Integer value) {
        this.nombreCategoria = value;
    }

    private java.util.Set getORM_Producto() {
        return ORM_producto;
    }

    private void setORM_Producto(java.util.Set value) {
        this.ORM_producto = value;
    }

    public String toString() {
        return String.valueOf(getId());
    }

}
