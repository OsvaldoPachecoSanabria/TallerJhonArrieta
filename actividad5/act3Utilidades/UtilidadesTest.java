package actividad5.act3Utilidades;

public class UtilidadesTest {
    public static void main(String[] args) {
        // Pruebas para el método suma
        System.out.println("Suma de 5 + 3: " + Utilidades.suma(5, 3)); // Esperado: 8

        // Pruebas para el método resta
        System.out.println("Resta de 5 - 3: " + Utilidades.resta(5, 3)); // Esperado: 2

        // Pruebas para el método multiplicacion
        System.out.println("Multiplicación de 5 * 3: " + Utilidades.multiplicacion(5, 3)); // Esperado: 15

        // Pruebas para el método division
        try {
            System.out.println("División de 6 / 3: " + Utilidades.division(6, 3)); // Esperado: 2.0
            System.out.println("División de 6 / 0: " + Utilidades.division(6, 0)); // Esperado: Error
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
