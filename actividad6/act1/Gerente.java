package actividad6.act1;

public class Gerente extends Empleado {
    private String departamento;

    public Gerente(String nombre, int salario, String departamento) {
        super(nombre, salario);
        this.departamento = departamento;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Departamento: " + departamento);
    }

}
