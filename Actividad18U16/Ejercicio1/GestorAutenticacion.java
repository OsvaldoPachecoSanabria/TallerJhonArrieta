package Actividad18U16.Ejercicio1;

public class GestorAutenticacion {
    private ServicioAutenticacion servicioAutenticacion;

    public GestorAutenticacion(ServicioAutenticacion servicioAutenticacion) {
        this.servicioAutenticacion = servicioAutenticacion;
    }

    public boolean autenticarUsuario(String usuario, String contrasena) {
        return servicioAutenticacion.autenticar(usuario, contrasena);
    }
}