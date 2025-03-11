package Actividad13U11.ejercicio4;

public class Vehiculo {
    public void mover() {
        System.out.println("El vehículo se está moviendo");
    }
}

class Coche extends Vehiculo {
    @Override
    public void mover() {
        System.out.println("El coche se está moviendo");
    }
}

class Bicicleta extends Vehiculo {
    @Override
    public void mover() {
        System.out.println("La bicicleta se está moviendo");
    }
}
