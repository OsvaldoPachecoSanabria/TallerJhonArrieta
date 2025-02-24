package actividad8;

public class ProbarFiguras {
    public static void main(String[] args) {
        Figura circulo = new Circulo(5);
        Figura rectangulo = new Rectangulo(5, 10);

        circulo.mostrarArea();
        rectangulo.mostrarArea();

    }
}
