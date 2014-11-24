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

import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.AbstractORMDetachedCriteria;
import org.orm.criteria.AssociationExpression;
import org.orm.criteria.CollectionExpression;
import org.orm.criteria.StringExpression;

import java.util.List;

public class ProductoDetachedCriteria extends AbstractORMDetachedCriteria {
    public final StringExpression nombreProducto;
    public final StringExpression categoriasId;
    public final AssociationExpression categorias;
    public final CollectionExpression item;

    public ProductoDetachedCriteria() {
        super(productos.Producto.class, productos.ProductoCriteria.class);
        nombreProducto = new StringExpression("nombreProducto", this.getDetachedCriteria());
        categoriasId = new StringExpression("ORM_Categorias.nombreCategoria", this.getDetachedCriteria());
        categorias = new AssociationExpression("ORM_Categorias", this.getDetachedCriteria());
        item = new CollectionExpression("ORM_Item", this.getDetachedCriteria());
    }

    public ProductoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
        super(aDetachedCriteria, productos.ProductoCriteria.class);
        nombreProducto = new StringExpression("nombreProducto", this.getDetachedCriteria());
        categoriasId = new StringExpression("ORM_Categorias.nombreCategoria", this.getDetachedCriteria());
        categorias = new AssociationExpression("ORM_Categorias", this.getDetachedCriteria());
        item = new CollectionExpression("ORM_Item", this.getDetachedCriteria());
    }

    public CategoriaDetachedCriteria createCategoriasCriteria() {
        return new CategoriaDetachedCriteria(createCriteria("ORM_Categorias"));
    }

    public ItemDetachedCriteria createItemCriteria() {
        return new ItemDetachedCriteria(createCriteria("ORM_Item"));
    }

    public Producto uniqueProducto(PersistentSession session) {
        return (Producto) super.createExecutableCriteria(session).uniqueResult();
    }

    public Producto[] listProducto(PersistentSession session) {
        List list = super.createExecutableCriteria(session).list();
        return (Producto[]) list.toArray(new Producto[list.size()]);
    }
}

