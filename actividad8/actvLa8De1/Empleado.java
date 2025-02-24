package actividad8.actvLa8De1;

public abstract class Empleado {
    public abstract double calcularSalario();

    public void mostrarSalario() {
        System.out.println("El salario del empleado es: " + calcularSalario());
    }
}
