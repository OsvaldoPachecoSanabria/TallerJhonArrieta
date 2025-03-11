package Activdad14U12.actv2;

public class EtiquetaProducto {
    public String generarEtiqueta(Producto producto) {
        return "Nombre: " + producto.getNombre() + "\n" +
                "Descripción: " + producto.getDescripcion() + "\n" +
                "Precio Base: " + producto.getPrecioBase() + "\n" +
                "Impuesto: " + producto.getImpuesto();
    }
}