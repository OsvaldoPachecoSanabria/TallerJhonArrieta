package Actividad18U16.Ejercicio1;

public class Main {
    public static void main(String[] args) {
        ServicioAutenticacion localAuth = new AutenticacionLocal();
        ServicioAutenticacion oauthAuth = new AutenticacionOAuth();

        GestorAutenticacion gestorLocal = new GestorAutenticacion(localAuth);
        GestorAutenticacion gestorOAuth = new GestorAutenticacion(oauthAuth);

        System.out.println(gestorLocal.autenticarUsuario("usuarioLocal", "contrasenaLocal")); // true
        System.out.println(gestorOAuth.autenticarUsuario("usuarioOAuth", "contrasenaOAuth")); // true
    }
}
