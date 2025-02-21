package actividad7.ACTV1;

public class Coche {
    String marca;
    String modelo;
    static int contadorCoches = 0;

    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        // contador
        contadorCoches++;
    }

    // Metodo estatico para que me muestre cuantos coches Se han creado
    public static int getContadorCoches() {
        return contadorCoches;
    }
}
