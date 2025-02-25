package Actividad11.Ejercicio2;

public class Animal implements Nadador, Volador {
    private String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void nadar() {
        System.out.println(nombre + " está nadando.");
    }

    @Override
    public void volar() {
        System.out.println(nombre + " está volando.");
    }

}
