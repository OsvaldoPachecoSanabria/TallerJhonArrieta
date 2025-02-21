package actividad7.ACTV1;

public class PruebaCoche {
    public static void main(String[] args) {

        Coche coche1 = new Coche("Seat", "Ibiza");
        Coche coche2 = new Coche("Renault", "Clio");
        Coche coche3 = new Coche("Ford", "Focus");

        System.out.println("Coches creados: " + Coche.getContadorCoches()); // Esperado: 3
    }
}
