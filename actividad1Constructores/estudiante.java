package actividad1Constructores;

public class estudiante {
    String nombre;
    int edad;
    String curso;

    public estudiante() {
        this.nombre = "Juanito";
        this.edad = 15;
        this.curso = "Decimo";
    }

    public estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

}
