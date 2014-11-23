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

import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.AbstractORMDetachedCriteria;
import org.orm.criteria.CollectionExpression;
import org.orm.criteria.StringExpression;

import java.util.List;

public class UsuarioDetachedCriteria extends AbstractORMDetachedCriteria {
    public final StringExpression email;
    public final StringExpression password;
    public final StringExpression direccion;
    public final StringExpression numeroTelefono;
    public final StringExpression mascotaFavorita;
    public final CollectionExpression shoppingCart;

    public UsuarioDetachedCriteria() {
        super(login.Usuario.class, login.UsuarioCriteria.class);
        email = new StringExpression("email", this.getDetachedCriteria());
        password = new StringExpression("password", this.getDetachedCriteria());
        direccion = new StringExpression("direccion", this.getDetachedCriteria());
        numeroTelefono = new StringExpression("numeroTelefono", this.getDetachedCriteria());
        mascotaFavorita = new StringExpression("mascotaFavorita", this.getDetachedCriteria());
        shoppingCart = new CollectionExpression("ORM_ShoppingCart", this.getDetachedCriteria());
    }

    public UsuarioDetachedCriteria(DetachedCriteria aDetachedCriteria) {
        super(aDetachedCriteria, login.UsuarioCriteria.class);
        email = new StringExpression("email", this.getDetachedCriteria());
        password = new StringExpression("password", this.getDetachedCriteria());
        direccion = new StringExpression("direccion", this.getDetachedCriteria());
        numeroTelefono = new StringExpression("numeroTelefono", this.getDetachedCriteria());
        mascotaFavorita = new StringExpression("mascotaFavorita", this.getDetachedCriteria());
        shoppingCart = new CollectionExpression("ORM_ShoppingCart", this.getDetachedCriteria());
    }

    public shoppingcart.ShoppingCartDetachedCriteria createShoppingCartCriteria() {
        return new shoppingcart.ShoppingCartDetachedCriteria(createCriteria("ORM_ShoppingCart"));
    }

    public Usuario uniqueUsuario(PersistentSession session) {
        return (Usuario) super.createExecutableCriteria(session).uniqueResult();
    }

    public Usuario[] listUsuario(PersistentSession session) {
        List list = super.createExecutableCriteria(session).list();
        return (Usuario[]) list.toArray(new Usuario[list.size()]);
    }
}

