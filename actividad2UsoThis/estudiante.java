package actividad2UsoThis;

// definicion de clase estudiante atributos nombres y edad
public class estudiante {

    String nombre;
    int edad;

    // constructoor por defecto que llame aun constructor con parametros
    public estudiante() {
        this("Random name", 0);
    }

    // se evidencia el error de que el constructor no esta definido
    // se debe definir un constructor con parametros
    public estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Metodo que muestre (imprima) los detalles de estudiante
    public void mostrarDetalles() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Edad: " + this.edad);
    }
}
