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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class ShoppingCartCriteria extends AbstractORMCriteria {
    public final IntegerExpression id;
    public final DoubleExpression subTotal;
    public final DoubleExpression total;
    public final StringExpression usuarioemailId;
    public final AssociationExpression usuarioemail;
    public final CollectionExpression shoppingCart_item;

    public ShoppingCartCriteria(Criteria criteria) {
        super(criteria);
        id = new IntegerExpression("id", this);
        subTotal = new DoubleExpression("subTotal", this);
        total = new DoubleExpression("total", this);
        usuarioemailId = new StringExpression("usuarioemail.email", this);
        usuarioemail = new AssociationExpression("usuarioemail", this);
        shoppingCart_item = new CollectionExpression("ORM_ShoppingCart_item", this);
    }

    public ShoppingCartCriteria(PersistentSession session) {
        this(session.createCriteria(ShoppingCart.class));
    }

    public ShoppingCartCriteria() throws PersistentException {
        this(login.PetStorePersistentManager.instance().getSession());
    }

    public login.UsuarioCriteria createUsuarioemailCriteria() {
        return new login.UsuarioCriteria(createCriteria("usuarioemail"));
    }

    public shoppingcart.ShoppingCart_itemCriteria createShoppingCart_itemCriteria() {
        return new shoppingcart.ShoppingCart_itemCriteria(createCriteria("ORM_ShoppingCart_item"));
    }

    public ShoppingCart uniqueShoppingCart() {
        return (ShoppingCart) super.uniqueResult();
    }

    public ShoppingCart[] listShoppingCart() {
        java.util.List list = super.list();
        return (ShoppingCart[]) list.toArray(new ShoppingCart[list.size()]);
    }
}

