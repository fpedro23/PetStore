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
import org.orm.criteria.*;

public class ItemCriteria extends AbstractORMCriteria {
    public final IntegerExpression id;
    public final StringExpression nombreItem;
    public final IntegerExpression precio;
    public final AssociationExpression productos;
    public final CollectionExpression shoppingCart_item;

    public ItemCriteria(Criteria criteria) {
        super(criteria);
        id = new IntegerExpression("id", this);
        nombreItem = new StringExpression("nombreItem", this);
        precio = new IntegerExpression("precio", this);
        productos = new AssociationExpression("productos", this);
        shoppingCart_item = new CollectionExpression("ORM_ShoppingCart_item", this);
    }

    public ItemCriteria(PersistentSession session) {
        this(session.createCriteria(Item.class));
    }

    public ItemCriteria() throws PersistentException {
        this(login.PetStorePersistentManager.instance().getSession());
    }

    public ProductoCriteria createProductosCriteria() {
        return new ProductoCriteria(createCriteria("productos"));
    }

    public shoppingcart.ShoppingCart_itemCriteria createShoppingCart_itemCriteria() {
        return new shoppingcart.ShoppingCart_itemCriteria(createCriteria("ORM_ShoppingCart_item"));
    }

    public Item uniqueItem() {
        return (Item) super.uniqueResult();
    }

    public Item[] listItem() {
        java.util.List list = super.list();
        return (Item[]) list.toArray(new Item[list.size()]);
    }
}

