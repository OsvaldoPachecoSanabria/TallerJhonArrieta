package actividad9.act2De9;

public class PruebaEstudiante {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Juan", 20, "123456");
        System.out.println("Estudiante Creado: ");
        estudiante.mostrarInformacion();

        Estudiante estudiante2 = new Estudiante("Maria", 22, "654321");
        System.out.println("Estudiante 2 Creado: ");
        estudiante2.mostrarInformacion();
    }
}
