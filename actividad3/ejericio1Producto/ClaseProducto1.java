package actividad3.ejericio1Producto;

public class ClaseProducto1 {
    String nombre;
    double precio;
    int stock;

    // constructor que inicialice todas las propiedades
    public ClaseProducto1(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    // metodo que muestre (imprima) los detalles de producto

    public void mostrarInfo() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Precio: " + this.precio);
        System.out.println("Stock: " + this.stock);
    }
}
