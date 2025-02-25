package Actividad12.ejercicio3;

public abstract class MiClaseAbstracta {
    public abstract void miMetodoAbstracto();

    // int miMetodoAbstracto(int a); // Error: Abstract metodo no puede tener cuerpo
    public void metodoPredeterminado() {
        System.out.println("Este es un metodo predeterminado");
    }
}
