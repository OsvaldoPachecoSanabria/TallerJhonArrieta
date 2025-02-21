package actividad5.act2CTBancaria;

public class CuentaBancaria {
    private String numeroCuenta;
    private double saldo;
    public String tipoDeCuenta;

    public double getsaldo() {
        return saldo;
    }

    public void setsaldo(double saldo) {
        this.saldo = saldo;
    }

    public void mostrarDetallesCuenta() {
        System.out.println("Número de cuenta: " + numeroCuenta);
        System.out.println("Saldo: " + saldo);
        System.out.println("Tipo de cuenta: " + tipoDeCuenta);
    }
}
