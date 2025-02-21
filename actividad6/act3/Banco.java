package actividad6.act3;

public class Banco {
    // protected double saldo;
    private double saldo;

    public Banco(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
        // por aca iria una validacioon de >= 0 para que no se pueda setear un saldo
        // negativo
    }

    // ya con este cambio solo se podra acceder a estos datos con metodos
    // y no directamente como antes
}
