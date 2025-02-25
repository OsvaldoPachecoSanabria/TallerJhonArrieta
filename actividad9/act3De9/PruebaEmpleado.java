package actividad9.act3De9;

public class PruebaEmpleado {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Juan", 20000);
        System.out.println("Empleado Creado: ");
        empleado.mostrarDetalles();

        Gerente gerente = new Gerente("Maria", 30000, "Sistemas");
        System.out.println("Gerente Creado: ");
        gerente.mostrarDetalles();
    }
}
