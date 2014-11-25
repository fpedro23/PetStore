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
import org.orm.criteria.AbstractORMDetachedCriteria;
import org.orm.criteria.AssociationExpression;
import org.orm.criteria.IntegerExpression;

import java.util.List;

public class ShoppingCart_itemDetachedCriteria extends AbstractORMDetachedCriteria {
    public final IntegerExpression shoppingCartId;
    public final AssociationExpression shoppingCart;
    public final IntegerExpression itemId;
    public final AssociationExpression item;
    public final IntegerExpression cantidad;

    public ShoppingCart_itemDetachedCriteria() {
        super(shoppingcart.ShoppingCart_item.class, shoppingcart.ShoppingCart_itemCriteria.class);
        shoppingCartId = new IntegerExpression("ORM_ShoppingCart.id", this.getDetachedCriteria());
        shoppingCart = new AssociationExpression("ORM_ShoppingCart", this.getDetachedCriteria());
        itemId = new IntegerExpression("ORM_Item.id", this.getDetachedCriteria());
        item = new AssociationExpression("ORM_Item", this.getDetachedCriteria());
        cantidad = new IntegerExpression("cantidad", this.getDetachedCriteria());
    }

    public ShoppingCart_itemDetachedCriteria(DetachedCriteria aDetachedCriteria) {
        super(aDetachedCriteria, shoppingcart.ShoppingCart_itemCriteria.class);
        shoppingCartId = new IntegerExpression("ORM_ShoppingCart.id", this.getDetachedCriteria());
        shoppingCart = new AssociationExpression("ORM_ShoppingCart", this.getDetachedCriteria());
        itemId = new IntegerExpression("ORM_Item.id", this.getDetachedCriteria());
        item = new AssociationExpression("ORM_Item", this.getDetachedCriteria());
        cantidad = new IntegerExpression("cantidad", this.getDetachedCriteria());
    }

    public ShoppingCartDetachedCriteria createShoppingCartCriteria() {
        return new ShoppingCartDetachedCriteria(createCriteria("ORM_ShoppingCart"));
    }

    public productos.ItemDetachedCriteria createItemCriteria() {
        return new productos.ItemDetachedCriteria(createCriteria("ORM_Item"));
    }

    public ShoppingCart_item uniqueShoppingCart_item(PersistentSession session) {
        return (ShoppingCart_item) super.createExecutableCriteria(session).uniqueResult();
    }

    public ShoppingCart_item[] listShoppingCart_item(PersistentSession session) {
        List list = super.createExecutableCriteria(session).list();
        return (ShoppingCart_item[]) list.toArray(new ShoppingCart_item[list.size()]);
    }
}

