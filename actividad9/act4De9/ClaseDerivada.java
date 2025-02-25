package actividad9.act4De9;

public class ClaseDerivada extends ClaseBase {
    public void mostrarAtributoPrivado() {

        // Error: intento De acceso Directo al atributo Privado(esto causará un error de
        // compilación)
        // System.out.println("ClaseDerivada.metodoDerivado" + atributoPrivado);

        System.out.println("Atributo Privado: " + getAtributoPrivado());
    }
}
