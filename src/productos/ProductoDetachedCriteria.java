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
import org.orm.criteria.IntegerExpression;

import java.util.List;

public class ProductoDetachedCriteria extends AbstractORMDetachedCriteria {
    public final IntegerExpression id;
    public final IntegerExpression nombreProducto;
    public final IntegerExpression categoriasId;
    public final AssociationExpression categorias;
    public final CollectionExpression item;

    public ProductoDetachedCriteria() {
        super(productos.Producto.class, productos.ProductoCriteria.class);
        id = new IntegerExpression("id", this.getDetachedCriteria());
        nombreProducto = new IntegerExpression("nombreProducto", this.getDetachedCriteria());
        categoriasId = new IntegerExpression("categorias.id", this.getDetachedCriteria());
        categorias = new AssociationExpression("categorias", this.getDetachedCriteria());
        item = new CollectionExpression("ORM_Item", this.getDetachedCriteria());
    }

    public ProductoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
        super(aDetachedCriteria, productos.ProductoCriteria.class);
        id = new IntegerExpression("id", this.getDetachedCriteria());
        nombreProducto = new IntegerExpression("nombreProducto", this.getDetachedCriteria());
        categoriasId = new IntegerExpression("categorias.id", this.getDetachedCriteria());
        categorias = new AssociationExpression("categorias", this.getDetachedCriteria());
        item = new CollectionExpression("ORM_Item", this.getDetachedCriteria());
    }

    public CategoriaDetachedCriteria createCategoriasCriteria() {
        return new CategoriaDetachedCriteria(createCriteria("categorias"));
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

