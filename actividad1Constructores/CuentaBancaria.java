package actividad1Constructores;

public class CuentaBancaria {
    String numeroCuenta;
    double saldo;
    String tipoCuenta;

    // por defecto
    public CuentaBancaria() {
        this.numeroCuenta = "4142149124821";
        this.saldo = 500000;
        this.tipoCuenta = "Ahorros";
    }
    // parametrizado con dos parametros

    public CuentaBancaria(String numeroCuenta, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
        this.saldo = 0;
    }

    public CuentaBancaria(String numeroCuenta, double saldo, String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "El numero De cuenta es: " + numeroCuenta
                + "El tipo De cuenta es: " + tipoCuenta +
                "Y su saldo en la cuenta es: " + saldo;
    }
}