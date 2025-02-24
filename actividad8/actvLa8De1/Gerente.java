package actividad8.actvLa8De1;

public class Gerente extends Empleado {
    private double salario;
    private double bono;

    public Gerente(double salario, double bono) {
        this.salario = salario;
        this.bono = bono;
    }

    @Override
    public double calcularSalario() {
        return salario + bono;
    }

    @Override
    public void mostrarSalario() {
        System.out.println("El salario del gerente es: " + calcularSalario());
        super.mostrarSalario();
    }

}
