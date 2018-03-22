
package Model;

import java.util.ArrayList;
import java.util.Date;

public class FacturaProducto extends Facturas{
    
    private ArrayList<Producto> Productos = new ArrayList<>();
    
    public FacturaProducto(String Id, Date Fecha, int Cantidad, double Total, ArrayList<Producto> Productos) {
        super(Id, Fecha, Cantidad, Total);
        this.Productos =  (ArrayList<Producto>) Productos.clone();
    }

    public ArrayList<Producto> getProductos() {
        return Productos;
    }
    
}
