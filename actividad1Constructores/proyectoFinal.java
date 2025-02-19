package actividad1Constructores;

import java.util.Scanner;

public class proyectoFinal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear objetos con diferentes constructores
        Libro libro1 = new Libro();
        Libro libro2 = new Libro("El Señor de los Anillos", "J.R.R. Tolkien", 1178);

        CuentaBancaria cuenta1 = new CuentaBancaria();
        CuentaBancaria cuenta2 = new CuentaBancaria("1234567890", "Ahorro");
        CuentaBancaria cuenta3 = new CuentaBancaria("9876543210", 1000, "Corriente");

        estudiante estudiante1 = new estudiante();
        estudiante estudiante2 = new estudiante("Juan", 20);
        estudiante estudiante3 = new estudiante("María", 22, "Ingeniería");

        // Ingresar datos por consola para Libro 1
        System.out.println("Ingrese los datos del libro 1:");
        System.out.print("Título: ");
        libro1.titulo = scanner.nextLine();
        System.out.print("Autor: ");
        libro1.autor = scanner.nextLine();
        System.out.print("Número de libros que se imprimiran: ");
        libro1.numeroDeLibros = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer del scanner

        // Ingresar datos por consola para Cuenta 1
        System.out.println("\nIngrese los datos de la cuenta 1:");
        System.out.print("Número de cuenta: ");
        cuenta1.numeroCuenta = scanner.nextLine();
        System.out.print("Saldo: ");
        cuenta1.saldo = scanner.nextDouble();
        scanner.nextLine(); // Limpiar el buffer del scanner
        System.out.print("Tipo de cuenta: ");
        cuenta1.tipoCuenta = scanner.nextLine();

        // Ingresar datos por consola para Estudiante 1
        System.out.println("\nIngrese los datos del estudiante 1:");
        System.out.print("Nombre: ");
        estudiante1.nombre = scanner.nextLine();
        System.out.print("Edad: ");
        estudiante1.edad = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer del scanner
        System.out.print("Curso: ");
        estudiante1.curso = scanner.nextLine();

        // Mostrar detalles de los objetos usando toString()
        System.out.println(libro1.toString());
        System.out.println(libro2.toString());
        System.out.println(cuenta1.toString());
        System.out.println(cuenta2.toString());
        System.out.println(cuenta3.toString());
        System.out.println(estudiante1.toString());
        System.out.println(estudiante2.toString());
        System.out.println(estudiante3.toString());

        scanner.close();
    }

    @Override
    public String toString() {
        return "proyectoFinal{}";
    }
}