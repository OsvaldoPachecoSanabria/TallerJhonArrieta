package actividad4.ejercicio2;

public class PruebaCoche {
    public static void main(String[] args) {
        Coche coche = new Coche();
        coche.setMarca("Toyota");
        coche.setModelo("Sahara");
        coche.setVelocidadMaxima(200);

        // Intento de acceso a las propiedades directamente desde la clase PruebaCoche
        // (sin usar los métodos set)
        // coche.marca = "Honda"; // Error
        // coche.modelo = "Civic"; // Error
        // coche.velocidadMaxima = 200; // Error

        // usa getters para acceder a las propiedades
        System.out.println("Marca: " + coche.getMarca());
        System.out.println("Modelo: " + coche.getModelo());
        System.out.println("Velocidad Máxima: " + coche.getVelocidadMaxima());

        // usar el metodo acelerar
        coche.acelerar(50);
        System.out.println("Velocidad Máxima: " + coche.getVelocidadMaxima());
        coche.acelerar(-10); // Error (incremento negativo) es imposible

    }

}
