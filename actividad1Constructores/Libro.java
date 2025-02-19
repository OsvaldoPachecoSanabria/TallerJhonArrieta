package actividad1Constructores;

public class Libro {
    // default
    String titulo;
    String autor;
    int numeroDeLibros;

    public Libro() {
        this.titulo = "La Odisea";
        this.autor = "Homero";
        this.numeroDeLibros = 2000;
    }

    // parametrizado
    public Libro(String titulo, String autor, int numeroDeLibros) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDeLibros = numeroDeLibros;
    }

    // Metodos mostrar dellaes del libro.
    public void mostrarDetalles() {
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Numero de paginas: " + this.numeroDeLibros);
    }

    public static void main(String[] args) {
        // Usando el constructor por defecto
        Libro libro1 = new Libro();
        libro1.mostrarDetalles();

        // Usando el constructor parametrizado
        Libro libro2 = new Libro("El principito", "Antoine de Saint-Exupéry", 328);
        libro2.mostrarDetalles();
    }

}
