package actividad3SobreEscritura.Ejercicioo3UsoIncorrecto;

public class PruebaRumberoMayor {
    public static void main(String[] args) {
        TurboSonido turbo = new RumberoMayor();
        turbo.HacerPico(); // esto llama al metodo de la clase TurboSonido no al RumberoMayor
    }
}
