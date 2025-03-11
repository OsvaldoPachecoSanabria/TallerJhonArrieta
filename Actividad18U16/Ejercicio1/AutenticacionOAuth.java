package Actividad18U16.Ejercicio1;

public class AutenticacionOAuth implements ServicioAutenticacion {
    @Override
    public boolean autenticar(String usuario, String contrasena) {
        // Lógica de autenticación OAuth
        return "usuarioOAuth".equals(usuario) && "contrasenaOAuth".equals(contrasena);
    }
}