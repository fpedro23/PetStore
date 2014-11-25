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
    public Categoria() {
    }

    private java.util.Set this_getSet(int key) {
        if (key == login.ORMConstants.KEY_CATEGORIA_PRODUCTO) {
            return ORM_producto;
        }

        return null;
    }

    org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
        public java.util.Set getSet(int key) {
            return this_getSet(key);
        }

    };

    private String nombreCategoria;

    private java.util.Set ORM_producto = new java.util.HashSet();

    public void setNombreCategoria(String value) {
        this.nombreCategoria = value;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public String getORMID() {
        return getNombreCategoria();
    }

    private void setORM_Producto(java.util.Set value) {
        this.ORM_producto = value;
    }

    private java.util.Set getORM_Producto() {
        return ORM_producto;
    }

    public final productos.ProductoSetCollection producto = new productos.ProductoSetCollection(this, _ormAdapter, login.ORMConstants.KEY_CATEGORIA_PRODUCTO, login.ORMConstants.KEY_PRODUCTO_CATEGORIAS, login.ORMConstants.KEY_MUL_ONE_TO_MANY);

    public String toString() {
        return String.valueOf(getNombreCategoria());
    }

}
