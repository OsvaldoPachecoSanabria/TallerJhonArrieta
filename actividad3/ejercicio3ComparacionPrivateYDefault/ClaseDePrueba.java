package actividad3.ejercicio3ComparacionPrivateYDefault;

public class ClaseDePrueba {
    public static void main(String[] args) {
        // Crear un objeto de la clase Persona
        Persona persona1 = new Persona("Juan", 25);
        // Llamar al metodo getNombre
        System.out.println("Nombre: " + persona1.getNombre());
        // Llamar al metodo setNombre
        persona1.setNombre("Pedro");
        // Llamar al metodo getNombre
        System.out.println("Nombre: " + persona1.getNombre());

        Persona persona2 = new Persona("Javier", 30);

        // System.out.println(persona2.nombre); // Error: nombre no es accesible
        System.out.println(persona2.edad); // Acceso permitido

        System.out.println(persona2.getNombre()); // Acceso permitido
        persona2.setNombre("Carlos"); // Acceso permitido
    }
}
