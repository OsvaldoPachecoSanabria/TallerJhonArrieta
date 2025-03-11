package Actividad13U11.ejercicio1;

public class PruebaFiguras {
    public static void main(String[] args) {
        Figura[] figuras = new Figura[3];
        figuras[0] = new Figura();
        figuras[1] = new Circulo(5);
        figuras[2] = new Rectangulo(4, 6);

        for (Figura figura : figuras) {
            figura.calcularArea();
        }
    }
}
