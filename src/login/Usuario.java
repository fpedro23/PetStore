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

public class Usuario {
    public Usuario() {
    }

    private java.util.Set this_getSet(int key) {
        if (key == login.ORMConstants.KEY_USUARIO_SHOPPINGCART) {
            return ORM_shoppingCart;
        }

        return null;
    }

    org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
        public java.util.Set getSet(int key) {
            return this_getSet(key);
        }

    };

    private String email;

    private String password;

    private String direccion;

    private String numeroTelefono;

    private String mascotaFavorita;

    private java.util.Set ORM_shoppingCart = new java.util.HashSet();

    public void setEmail(String value) {
        this.email = value;
    }

    public String getEmail() {
        return email;
    }

    public String getORMID() {
        return getEmail();
    }

    public void setPassword(String value) {
        this.password = value;
    }

    public String getPassword() {
        return password;
    }

    public void setDireccion(String value) {
        this.direccion = value;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setNumeroTelefono(String value) {
        this.numeroTelefono = value;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setMascotaFavorita(String value) {
        this.mascotaFavorita = value;
    }

    public String getMascotaFavorita() {
        return mascotaFavorita;
    }

    private void setORM_ShoppingCart(java.util.Set value) {
        this.ORM_shoppingCart = value;
    }

    private java.util.Set getORM_ShoppingCart() {
        return ORM_shoppingCart;
    }

    public final shoppingcart.ShoppingCartSetCollection shoppingCart = new shoppingcart.ShoppingCartSetCollection(this, _ormAdapter, login.ORMConstants.KEY_USUARIO_SHOPPINGCART, login.ORMConstants.KEY_SHOPPINGCART_USUARIOEMAIL, login.ORMConstants.KEY_MUL_ONE_TO_MANY);

    public String toString() {
        return String.valueOf(getEmail());
    }

}
