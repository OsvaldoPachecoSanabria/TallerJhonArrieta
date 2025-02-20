package actividad2UsoThis;

public class erroresThis {
    // definicion de caracteristic
    String nombre;

    public erroresThis(String nombre) {
        this.nombre = nombre;
    }

    public void mostrarNombre() {
        System.out.println(this.nombre);
    }

    public static void main(String[] args) {
        erroresThis ejemplo = new erroresThis("Nombre generico");
        ejemplo.mostrarNombre();
    }
    // ejemplo de error
    // public static void ejemploDeError() {
    // System.out.println(this.nombre);
    // }

}
