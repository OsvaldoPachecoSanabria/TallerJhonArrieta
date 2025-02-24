package actividad8.actvLa8De1;

public class Vendedor extends Empleado {
    private double salario;
    private double comision;

    public Vendedor(double salario, double comision) {
        this.salario = salario;
        this.comision = comision;
    }

    @Override
    public double calcularSalario() {
        return salario + comision;
    }

    @Override
    public void mostrarSalario() {
        System.out.println("El salario del vendedor es: " + calcularSalario());
        super.mostrarSalario();
    }
}
