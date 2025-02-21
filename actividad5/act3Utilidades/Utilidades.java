package actividad5.act3Utilidades;

public class Utilidades {

    public static int suma(int a, int b) {
        return a + b;
    }

    public static int resta(int a, int b) {
        return a - b;
    }

    public static int multiplicacion(int a, int b) {
        return a * b;
    }

    public static double division(int a, int b) {
        if (b == 0) {
            System.out.println("No se puede dividir por cero");
        }
        return (double) a / b;
    }
}
