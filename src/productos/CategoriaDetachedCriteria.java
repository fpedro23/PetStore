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
import org.orm.criteria.CollectionExpression;
import org.orm.criteria.IntegerExpression;

import java.util.List;

public class CategoriaDetachedCriteria extends AbstractORMDetachedCriteria {
    public final IntegerExpression id;
    public final IntegerExpression nombreCategoria;
    public final CollectionExpression producto;

    public CategoriaDetachedCriteria() {
        super(productos.Categoria.class, productos.CategoriaCriteria.class);
        id = new IntegerExpression("id", this.getDetachedCriteria());
        nombreCategoria = new IntegerExpression("nombreCategoria", this.getDetachedCriteria());
        producto = new CollectionExpression("ORM_Producto", this.getDetachedCriteria());
    }

    public CategoriaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
        super(aDetachedCriteria, productos.CategoriaCriteria.class);
        id = new IntegerExpression("id", this.getDetachedCriteria());
        nombreCategoria = new IntegerExpression("nombreCategoria", this.getDetachedCriteria());
        producto = new CollectionExpression("ORM_Producto", this.getDetachedCriteria());
    }

    public ProductoDetachedCriteria createProductoCriteria() {
        return new ProductoDetachedCriteria(createCriteria("ORM_Producto"));
    }

    public Categoria uniqueCategoria(PersistentSession session) {
        return (Categoria) super.createExecutableCriteria(session).uniqueResult();
    }

    public Categoria[] listCategoria(PersistentSession session) {
        List list = super.createExecutableCriteria(session).list();
        return (Categoria[]) list.toArray(new Categoria[list.size()]);
    }
}

