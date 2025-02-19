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
        System.out.print("Número de páginas: ");
        libro1.numeroDeLibros = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer del scanner

    }
}