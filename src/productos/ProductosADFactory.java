package productos;

/**
 * Created by Pedro on 28/11/14.
 */
public class ProductosADFactory {
    public ProductosADInterface getProductosAD(String productoType) {
        if (productoType == null) {
            return null;
        }
        if (productoType.equalsIgnoreCase("PRODUCTOAD")) {
            return ProductosAD.createProductosAD();
        } else
            return null;
    }

}
