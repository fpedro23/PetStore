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
import org.orm.criteria.AbstractORMCriteria;
import org.orm.criteria.AssociationExpression;
import org.orm.criteria.IntegerExpression;

public class ShoppingCart_itemCriteria extends AbstractORMCriteria {
    public final IntegerExpression shoppingCartId;
    public final AssociationExpression shoppingCart;
    public final IntegerExpression itemId;
    public final AssociationExpression item;
    public final IntegerExpression cantidad;

    public ShoppingCart_itemCriteria(Criteria criteria) {
        super(criteria);
        shoppingCartId = new IntegerExpression("ORM_ShoppingCart.id", this);
        shoppingCart = new AssociationExpression("ORM_ShoppingCart", this);
        itemId = new IntegerExpression("ORM_Item.id", this);
        item = new AssociationExpression("ORM_Item", this);
        cantidad = new IntegerExpression("cantidad", this);
    }

    public ShoppingCart_itemCriteria(PersistentSession session) {
        this(session.createCriteria(ShoppingCart_item.class));
    }

    public ShoppingCart_itemCriteria() throws PersistentException {
        this(login.PetStorePersistentManager.instance().getSession());
    }

    public ShoppingCartCriteria createShoppingCartCriteria() {
        return new ShoppingCartCriteria(createCriteria("ORM_ShoppingCart"));
    }

    public productos.ItemCriteria createItemCriteria() {
        return new productos.ItemCriteria(createCriteria("ORM_Item"));
    }

    public ShoppingCart_item uniqueShoppingCart_item() {
        return (ShoppingCart_item) super.uniqueResult();
    }

    public ShoppingCart_item[] listShoppingCart_item() {
        java.util.List list = super.list();
        return (ShoppingCart_item[]) list.toArray(new ShoppingCart_item[list.size()]);
    }
}

