package actividad6.act2;

public class PruebaAcceso {
    public static void main(String[] args) {

        Moto moto = new Moto("Deportiva", "Boxer", 120);

        // System.out.println(moto.marca);
        // System.out.println(moto.cilindrada);
        // System.out.println(moto.tipo);
        // esta variable moto no se esta usando, porque no se esta llamando a ninguno
        // pero es porque intentan acceder a los miembros protected desde una clase no
        // relacionada
        // metodo de la clase Moto
        System.out.println("Cilindrada: " + moto.getCilindrada());
    }
}
