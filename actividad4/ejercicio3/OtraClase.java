package actividad4.ejercicio3;

public class OtraClase {
    public static void main(String[] args) {
        Clase objeto = new Clase(5);
        // System.out.println(objeto.propiedadPrivada);
        // No implementar métodos get y set para un atributo private puede afectar la
        // protección de datos de la siguiente manera:

        // No se puede acceder a la propiedad privada de la clase Clase desde otra
        // clase, ya que la propiedad es privada y no se han implementado métodos get y
        // set para acceder a ella.
        // no cuenta con un control de acceso para la propiedad privada, por lo que no
        // se puede acceder a ella desde otra clase.
        // Para poder acceder a la propiedad privada de la clase Clase desde otra clase,
        // se deben implementar métodos get y set para la propiedad privada en la clase
        // Clase.
    }
}
