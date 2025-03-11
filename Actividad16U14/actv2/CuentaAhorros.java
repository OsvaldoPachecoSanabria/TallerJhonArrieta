package Actividad16U14.actv2;

public class CuentaAhorros extends CuentaBancaria {
    private double tasaInteres;

    public CuentaAhorros(String titular, double saldoInicial, double tasaInteres) {
        super(titular, saldoInicial);
        this.tasaInteres = tasaInteres;
    }

    public double getTasaInteres() {
        return tasaInteres;
    }

    public void aplicarInteres() {
        double interes = getSaldo() * tasaInteres / 100;
        depositar(interes);
    }
}