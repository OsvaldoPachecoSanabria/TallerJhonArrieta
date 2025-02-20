package actividad3.ejericio1Producto;

public class testClaseProducto {
    public static void main(String[] args) {
        // Crear un objeto de la clase ClaseProducto1
        ClaseProducto1 producto1 = new ClaseProducto1("Laptop", 500.0, 10);
        // Llamar al metodo mostrarInfo
        producto1.mostrarInfo();

        ClaseProducto1 producto2 = new ClaseProducto1("Mouse", 10.0, 20);
        // Llamar al metodo mostrarInfo
        producto2.mostrarInfo();

        // acceso a los atributos de la clase para verificacion
        System.out.println("Nombre: " + producto1.nombre);
        System.out.println("Precio: " + producto1.precio);
        System.out.println("Stock: " + producto2.stock);
    }
}
