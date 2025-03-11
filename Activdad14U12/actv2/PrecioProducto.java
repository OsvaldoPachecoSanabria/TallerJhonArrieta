package Activdad14U12.actv2;

public class PrecioProducto {
    public double calcularPrecioFinal(Producto producto) {
        return producto.getPrecioBase() + (producto.getPrecioBase() * producto.getImpuesto());
    }
}