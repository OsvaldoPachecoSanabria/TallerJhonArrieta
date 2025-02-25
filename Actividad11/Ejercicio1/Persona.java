package Actividad11.Ejercicio1;

public class Persona implements Hablador, Trabajador {
    @Override
    public void hablar() {
        System.out.println("Hola, soy una persona y puedo hablar");
    }

    @Override
    public void trabajar() {
        System.out.println("Hola, soy una persona y puedo trabajar");
    }
}
