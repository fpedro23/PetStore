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
package shoppingcart;

import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

import java.util.List;

public class ShoppingCartDetachedCriteria extends AbstractORMDetachedCriteria {
    public final IntegerExpression id;
    public final DoubleExpression subTotal;
    public final DoubleExpression total;
    public final StringExpression usuarioemailId;
    public final AssociationExpression usuarioemail;
    public final CollectionExpression shoppingCart_item;

    public ShoppingCartDetachedCriteria() {
        super(shoppingcart.ShoppingCart.class, shoppingcart.ShoppingCartCriteria.class);
        id = new IntegerExpression("id", this.getDetachedCriteria());
        subTotal = new DoubleExpression("subTotal", this.getDetachedCriteria());
        total = new DoubleExpression("total", this.getDetachedCriteria());
        usuarioemailId = new StringExpression("usuarioemail.email", this.getDetachedCriteria());
        usuarioemail = new AssociationExpression("usuarioemail", this.getDetachedCriteria());
        shoppingCart_item = new CollectionExpression("ORM_ShoppingCart_item", this.getDetachedCriteria());
    }

    public ShoppingCartDetachedCriteria(DetachedCriteria aDetachedCriteria) {
        super(aDetachedCriteria, shoppingcart.ShoppingCartCriteria.class);
        id = new IntegerExpression("id", this.getDetachedCriteria());
        subTotal = new DoubleExpression("subTotal", this.getDetachedCriteria());
        total = new DoubleExpression("total", this.getDetachedCriteria());
        usuarioemailId = new StringExpression("usuarioemail.email", this.getDetachedCriteria());
        usuarioemail = new AssociationExpression("usuarioemail", this.getDetachedCriteria());
        shoppingCart_item = new CollectionExpression("ORM_ShoppingCart_item", this.getDetachedCriteria());
    }

    public login.UsuarioDetachedCriteria createUsuarioemailCriteria() {
        return new login.UsuarioDetachedCriteria(createCriteria("usuarioemail"));
    }

    public shoppingcart.ShoppingCart_itemDetachedCriteria createShoppingCart_itemCriteria() {
        return new shoppingcart.ShoppingCart_itemDetachedCriteria(createCriteria("ORM_ShoppingCart_item"));
    }

    public ShoppingCart uniqueShoppingCart(PersistentSession session) {
        return (ShoppingCart) super.createExecutableCriteria(session).uniqueResult();
    }

    public ShoppingCart[] listShoppingCart(PersistentSession session) {
        List list = super.createExecutableCriteria(session).list();
        return (ShoppingCart[]) list.toArray(new ShoppingCart[list.size()]);
    }
}

