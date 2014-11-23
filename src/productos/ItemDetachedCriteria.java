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
import org.orm.criteria.*;

import java.util.List;

public class ItemDetachedCriteria extends AbstractORMDetachedCriteria {
    public final IntegerExpression id;
    public final StringExpression nombreItem;
    public final IntegerExpression precio;
    public final IntegerExpression productosId;
    public final AssociationExpression productos;
    public final CollectionExpression shoppingCart_item;

    public ItemDetachedCriteria() {
        super(productos.Item.class, productos.ItemCriteria.class);
        id = new IntegerExpression("id", this.getDetachedCriteria());
        nombreItem = new StringExpression("nombreItem", this.getDetachedCriteria());
        precio = new IntegerExpression("precio", this.getDetachedCriteria());
        productosId = new IntegerExpression("productos.id", this.getDetachedCriteria());
        productos = new AssociationExpression("productos", this.getDetachedCriteria());
        shoppingCart_item = new CollectionExpression("ORM_ShoppingCart_item", this.getDetachedCriteria());
    }

    public ItemDetachedCriteria(DetachedCriteria aDetachedCriteria) {
        super(aDetachedCriteria, productos.ItemCriteria.class);
        id = new IntegerExpression("id", this.getDetachedCriteria());
        nombreItem = new StringExpression("nombreItem", this.getDetachedCriteria());
        precio = new IntegerExpression("precio", this.getDetachedCriteria());
        productosId = new IntegerExpression("productos.id", this.getDetachedCriteria());
        productos = new AssociationExpression("productos", this.getDetachedCriteria());
        shoppingCart_item = new CollectionExpression("ORM_ShoppingCart_item", this.getDetachedCriteria());
    }

    public ProductoDetachedCriteria createProductosCriteria() {
        return new ProductoDetachedCriteria(createCriteria("productos"));
    }

    public shoppingcart.ShoppingCart_itemDetachedCriteria createShoppingCart_itemCriteria() {
        return new shoppingcart.ShoppingCart_itemDetachedCriteria(createCriteria("ORM_ShoppingCart_item"));
    }

    public Item uniqueItem(PersistentSession session) {
        return (Item) super.createExecutableCriteria(session).uniqueResult();
    }

    public Item[] listItem(PersistentSession session) {
        List list = super.createExecutableCriteria(session).list();
        return (Item[]) list.toArray(new Item[list.size()]);
    }
}

