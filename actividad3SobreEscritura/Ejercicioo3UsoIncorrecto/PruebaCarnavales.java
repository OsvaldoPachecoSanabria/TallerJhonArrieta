package actividad3SobreEscritura.Ejercicioo3UsoIncorrecto;

public class PruebaCarnavales {
    public static void main(String[] args) {
        ElSayiayin sayiayin = new ElSayiayin();
        sayiayin.HacerPico(); // esto llama al metodo de la clase TurboSonido no al sayiayin

        // en otras palabras mandara a buscar otro Turbo no el Turbo en espesifico para
        // el pico sabroso que se viene
    }
}
