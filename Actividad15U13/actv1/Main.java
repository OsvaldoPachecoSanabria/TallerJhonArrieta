package Actividad15U13.actv1;

public class Main {
    public static void main(String[] args) {
        Descuento descuentoPorcentaje = new DescuentoPorcentaje(10); // 10% de descuento
        Descuento descuentoFijo = new DescuentoFijo(50); // Descuento fijo de 50 unidades

        double precioOriginal = 200;

        double precioConDescuentoPorcentaje = descuentoPorcentaje.aplicarDescuento(precioOriginal);
        double precioConDescuentoFijo = descuentoFijo.aplicarDescuento(precioOriginal);

        System.out.println("Precio original: " + precioOriginal);
        System.out.println("Precio con descuento por porcentaje: " + precioConDescuentoPorcentaje);
        System.out.println("Precio con descuento fijo: " + precioConDescuentoFijo);
    }
}