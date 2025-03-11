package Actividad13U11.ejercicio2;

public class TestPolimorfismo {
    public static void main(String[] args) {
        Persona persona = new Persona();
        Persona estudiante = new Estudiante();
        Persona profesor = new Profesor();

        persona.Presentarse();
        estudiante.Presentarse();
        profesor.Presentarse();
    }
}
