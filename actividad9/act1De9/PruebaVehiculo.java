package actividad9.act1De9;

public class PruebaVehiculo {
    public static void main(String[] args) {
        Vehiculo vehiculo1 = new Coche("Seat", 200, 5);
        Coche coche = new Coche(null, 0, 0);

        System.out.println("Vehiculo 1 Creado: ");
        vehiculo1.mostrarInformacion();
        System.out.println("Coche Creado: ");
        coche.mostrarInformacion();
    }
}
