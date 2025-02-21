package actividad7.ACTV3;

public class CRandom {
    private int valor;

    // public static void incrementarValor(){
    // valor++;// error de comipilacion, no se puede acceder a un atributo no
    // estatico desde un contexto estatico

    // Método estático que modifica un atributo no estático a través de una
    // instancia
    public static void incrementarValor(CRandom instancia) {
        instancia.valor++;
    }
}
