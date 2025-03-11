package Actividad13U11.ejercicio4;

public class PruebaVehiculos {
    public static void main(String[] args) {
        Vehiculo miVehiculo;

        miVehiculo = new Coche();
        miVehiculo.mover();

        miVehiculo = new Bicicleta();
        miVehiculo.mover();
    }
}
