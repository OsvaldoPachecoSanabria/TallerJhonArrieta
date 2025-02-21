package actividad5.act1Empleado;

public class PruebaEmpleado {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado();
        empleado1.nombre = "Juan";
        empleado1.setSalario(1000);
        System.out.println("Nombre: " + empleado1.nombre);
        System.out.println("Salario: " + empleado1.getSalario());
        empleado1.setSalario(-1000);
        System.out.println("Salario: " + empleado1.getSalario());
    }
}
