package Actividad18U16.Ejercicio1;

public class AutenticacionLocal implements ServicioAutenticacion {
    @Override
    public boolean autenticar(String usuario, String contrasena) {
        // Lógica de autenticación local
        return "usuarioLocal".equals(usuario) && "contrasenaLocal".equals(contrasena);
    }
}