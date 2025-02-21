package actividad4.ejercicio1;

public class Estudiante {
    private String nombre;
    private int edad;
    private double promedio;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        // validacion basica
        if (nombre.length() > 0) {
            this.nombre = nombre;
        } else {
            System.out.println("El nombre no puede estar vacío");
        }
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad >= 1) {
            this.edad = edad;
        } else {
            System.out.println("La edad no puede ser negativa");
        }
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        if (promedio < 0.0 || promedio > 10.0) {
            throw new IllegalArgumentException("La nota promedio debe estar entre 0.0 y 10.0");
        }
        this.promedio = promedio;
    }

}
