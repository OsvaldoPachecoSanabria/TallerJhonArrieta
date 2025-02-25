package Actividad12.ejercicio1;

public class PruebaFiguras {
    public static void main(String[] args) {
        Figura rectangulo = new Rectangulo(5, 10);
        Figura triangulo = new Triangulo(5, 10);

        rectangulo.mostrarArea();
        triangulo.mostrarArea();
    }
}
