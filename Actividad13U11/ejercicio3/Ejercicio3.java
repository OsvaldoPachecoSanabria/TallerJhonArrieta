package Actividad13U11.ejercicio3;

class Base {
    public void metodoBase() {
        System.out.println("Método de la clase base");
    }
}

class Derivada extends Base {
    @Override
    public void metodoBase() {
        // No se modifica el comportamiento
        super.metodoBase();
    }

    public void metodoDerivado() {
        System.out.println("Método de la clase derivada");
    }
}

public class Ejercicio3 {
    public static void main(String[] args) {
        Base obj = new Derivada();
        obj.metodoBase(); // Llamará al método sobrescrito en la clase derivada
        // obj.metodoDerivado(); // Esto causará un error de compilación
    }
}
