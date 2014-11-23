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
import org.orm.criteria.CollectionExpression;
import org.orm.criteria.IntegerExpression;

public class CategoriaCriteria extends AbstractORMCriteria {
    public final IntegerExpression id;
    public final IntegerExpression nombreCategoria;
    public final CollectionExpression producto;

    public CategoriaCriteria(Criteria criteria) {
        super(criteria);
        id = new IntegerExpression("id", this);
        nombreCategoria = new IntegerExpression("nombreCategoria", this);
        producto = new CollectionExpression("ORM_Producto", this);
    }

    public CategoriaCriteria(PersistentSession session) {
        this(session.createCriteria(Categoria.class));
    }

    public CategoriaCriteria() throws PersistentException {
        this(login.PetStorePersistentManager.instance().getSession());
    }

    public ProductoCriteria createProductoCriteria() {
        return new ProductoCriteria(createCriteria("ORM_Producto"));
    }

    public Categoria uniqueCategoria() {
        return (Categoria) super.uniqueResult();
    }

    public Categoria[] listCategoria() {
        java.util.List list = super.list();
        return (Categoria[]) list.toArray(new Categoria[list.size()]);
    }
}

