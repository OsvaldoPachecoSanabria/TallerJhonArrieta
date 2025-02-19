package actividad1Constructores;

public class proyectoFinal {
    public static void main(String[] args) {
        Libro libro1 = new Libro();
        Libro libro2 = new Libro("Libro random", "Escritor random", 323);

        CuentaBancaria cuenta1 = new CuentaBancaria();
        CuentaBancaria cuenta2 = new CuentaBancaria("1234567890", "Ahorro");
        CuentaBancaria cuenta3 = new CuentaBancaria("9876543210", 1000, "Corriente");

        estudiante estudiante1 = new estudiante();
        estudiante estudiante2 = new estudiante("Juan", 20);
        estudiante estudiante3 = new estudiante("María", 22, "Ingeniería");

    }
}
