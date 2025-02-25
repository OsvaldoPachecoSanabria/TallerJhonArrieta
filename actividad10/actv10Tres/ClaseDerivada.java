package actividad10.actv10Tres;

public class ClaseDerivada extends ClaseBase {
    public void mostrarAtributoPrivado() {
        // Intento de acceso directo al atributo privado utilizando super (esto causará
        // un error de compilación)
        // System.out.println("Atributo Privado: " + super.atributoPrivado);

        // Acceso correcto utilizando el método getter
        System.out.println("Atributo Privado: " + super.getAtributoPrivado());
    }
}
