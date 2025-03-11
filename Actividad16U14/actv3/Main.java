package Actividad16U14.actv3;

public class Main {
    public static void main(String[] args) {
        Transporte bicicleta = new Bicicleta("Giant", "Escape 3", 21);
        Transporte coche = new Coche("Toyota", "Corolla", 4);

        bicicleta.mover();
        coche.mover();
    }
}
// What is the result?
// A. El transporte se está moviendo.
// por lo tanto si sustituye perfectamente a la clase padre
