package actividad8;

public abstract class Figura {
    public abstract double calcularArea();

    void mostrarArea() {
        System.out.println("El area de la figura es: " + calcularArea());
    }
}
