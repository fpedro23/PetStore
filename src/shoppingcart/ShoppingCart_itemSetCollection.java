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

import org.orm.PersistentException;
import org.orm.PersistentManager;

public class ShoppingCart_itemSetCollection extends org.orm.util.ORMSet {
    public ShoppingCart_itemSetCollection(Object owner, org.orm.util.ORMAdapter adapter, int ownerKey, int targetKey, int collType) {
        super(owner, adapter, ownerKey, targetKey, true, collType);
    }

    public ShoppingCart_itemSetCollection(Object owner, org.orm.util.ORMAdapter adapter, int ownerKey, int collType) {
        super(owner, adapter, ownerKey, -1, false, collType);
    }

    /**
     * Return an iterator over the persistent objects
     *
     * @return The persisten objects iterator
     */
    public java.util.Iterator getIterator() {
        return super.getIterator(_ownerAdapter);
    }

    /**
     * Add the specified persistent object to ORMSet
     *
     * @param value the persistent object
     */
    public void add(ShoppingCart_item value) {
        if (value != null) {
            super.add(value, value._ormAdapter);
        }
    }

    /**
     * Remove the specified persistent object from ORMSet
     *
     * @param value the persistent object
     */
    public void remove(ShoppingCart_item value) {
        super.remove(value, value._ormAdapter);
    }

    /**
     * Return true if ORMSet contains the specified persistent object
     *
     * @param value the persistent object
     * @return True if this contains the specified persistent object
     */
    public boolean contains(ShoppingCart_item value) {
        return super.contains(value);
    }

    /**
     * Return an array containing all of the persistent objects in ORMSet
     *
     * @return The persistent objects array
     */
    public ShoppingCart_item[] toArray() {
        return (ShoppingCart_item[]) super.toArray(new ShoppingCart_item[size()]);
    }

    /**
     * Return an sorted array containing all of the persistent objects in ORMSet
     *
     * @param propertyName Name of the property for sorting:<ul>
     *                     <li>cantidad</li>
     *                     </ul>
     * @return The persistent objects sorted array
     */
    public ShoppingCart_item[] toArray(String propertyName) {
        return toArray(propertyName, true);
    }

    /**
     * Return an sorted array containing all of the persistent objects in ORMSet
     *
     * @param propertyName Name of the property for sorting:<ul>
     *                     <li>cantidad</li>
     *                     </ul>
     * @param ascending    true for ascending, false for descending
     * @return The persistent objects sorted array
     */
    public ShoppingCart_item[] toArray(String propertyName, boolean ascending) {
        return (ShoppingCart_item[]) super.toArray(new ShoppingCart_item[size()], propertyName, ascending);
    }

    protected PersistentManager getPersistentManager() throws PersistentException {
        return login.PetStorePersistentManager.instance();
    }

}

