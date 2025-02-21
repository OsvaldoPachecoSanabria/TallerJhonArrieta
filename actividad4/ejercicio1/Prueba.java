package actividad4.ejercicio1;

public class Prueba {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante();
        estudiante.setNombre("Juan");
        estudiante.setEdad(20);
        estudiante.setPromedio(9.5);
        System.out.println("Nombre: " + estudiante.getNombre());
        System.out.println("Edad: " + estudiante.getEdad()); // estos son los que nos ayuda acceder a los propiedades de
                                                             // la clase
        System.out.println("Promedio: " + estudiante.getPromedio());
    }

}
