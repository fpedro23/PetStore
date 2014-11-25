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
package login;

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.AbstractORMCriteria;
import org.orm.criteria.CollectionExpression;
import org.orm.criteria.StringExpression;

public class UsuarioCriteria extends AbstractORMCriteria {
    public final StringExpression email;
    public final StringExpression password;
    public final StringExpression direccion;
    public final StringExpression numeroTelefono;
    public final StringExpression mascotaFavorita;
    public final CollectionExpression shoppingCart;

    public UsuarioCriteria(Criteria criteria) {
        super(criteria);
        email = new StringExpression("email", this);
        password = new StringExpression("password", this);
        direccion = new StringExpression("direccion", this);
        numeroTelefono = new StringExpression("numeroTelefono", this);
        mascotaFavorita = new StringExpression("mascotaFavorita", this);
        shoppingCart = new CollectionExpression("ORM_ShoppingCart", this);
    }

    public UsuarioCriteria(PersistentSession session) {
        this(session.createCriteria(Usuario.class));
    }

    public UsuarioCriteria() throws PersistentException {
        this(login.PetStorePersistentManager.instance().getSession());
    }

    public shoppingcart.ShoppingCartCriteria createShoppingCartCriteria() {
        return new shoppingcart.ShoppingCartCriteria(createCriteria("ORM_ShoppingCart"));
    }

    public Usuario uniqueUsuario() {
        return (Usuario) super.uniqueResult();
    }

    public Usuario[] listUsuario() {
        java.util.List list = super.list();
        return (Usuario[]) list.toArray(new Usuario[list.size()]);
    }
}

