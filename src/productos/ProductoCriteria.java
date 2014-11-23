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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.AbstractORMCriteria;
import org.orm.criteria.AssociationExpression;
import org.orm.criteria.CollectionExpression;
import org.orm.criteria.IntegerExpression;

public class ProductoCriteria extends AbstractORMCriteria {
    public final IntegerExpression id;
    public final IntegerExpression nombreProducto;
    public final IntegerExpression categoriasId;
    public final AssociationExpression categorias;
    public final CollectionExpression item;

    public ProductoCriteria(Criteria criteria) {
        super(criteria);
        id = new IntegerExpression("id", this);
        nombreProducto = new IntegerExpression("nombreProducto", this);
        categoriasId = new IntegerExpression("categorias.id", this);
        categorias = new AssociationExpression("categorias", this);
        item = new CollectionExpression("ORM_Item", this);
    }

    public ProductoCriteria(PersistentSession session) {
        this(session.createCriteria(Producto.class));
    }

    public ProductoCriteria() throws PersistentException {
        this(login.PetStorePersistentManager.instance().getSession());
    }

    public CategoriaCriteria createCategoriasCriteria() {
        return new CategoriaCriteria(createCriteria("categorias"));
    }

    public ItemCriteria createItemCriteria() {
        return new ItemCriteria(createCriteria("ORM_Item"));
    }

    public Producto uniqueProducto() {
        return (Producto) super.uniqueResult();
    }

    public Producto[] listProducto() {
        java.util.List list = super.list();
        return (Producto[]) list.toArray(new Producto[list.size()]);
    }
}

