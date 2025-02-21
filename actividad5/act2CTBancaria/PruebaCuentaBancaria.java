package actividad5.act2CTBancaria;

public class PruebaCuentaBancaria {
    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria();
        // Error: numeroCuenta tiene acceso privado
        // cuenta1.numeroCuenta = "123456";
        cuenta1.setSaldo(1000);
        cuenta1.tipoDeCuenta = "Ahorros";
        cuenta1.mostrarDetallesCuenta();
        cuenta1.setSaldo(2000);
        cuenta1.mostrarDetallesCuenta();
    }
}
