package Actividad12.ejercicio2;

public class Pato implements Nadador, Volador {
    @Override
    public void volar() {
        System.out.println("El pato está volando");
    }

    @Override
    public void nadar() {
        System.out.println("El pato está nadando");
    }

}
