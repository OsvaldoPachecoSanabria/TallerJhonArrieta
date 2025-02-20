package actividad2UsoThis;

public class producto {
    // Definicion de clase prudcto atributos nombres y precio
    String nombre;
    double precio;

    // Constructor de la clase producto con parametros nombre y precio
    public producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    // Metodo que muestre (imprima) los detalles de estudiante

    public void mostrarDetalles() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Precio: " + this.precio);
    }
}
