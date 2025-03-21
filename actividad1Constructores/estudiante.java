package actividad1Constructores;

public class estudiante {
    String nombre;
    int edad;
    String curso;

    // Constructor Values genericos
    public estudiante() {
        this("juanito", 15, "Decimo");
    }

    // Constructor Only names y edad
    public estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // constructor que acepta todos los parametros minetras llama a otro
    public estudiante(String nombre, int edad, String curso) {
        this(nombre, edad);
        this.curso = curso;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Nombre de Estudiante : " + nombre + ", La edad del estudiante : " + edad + " Y el año escolar es : "
                + curso;
    }
}
