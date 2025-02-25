package actividad9.act1De9;

public class Vehiculo {
    private String marca;
    private double velocidadMaxima;

    public Vehiculo(String marca, double velocidadMaxima) {
        this.marca = marca;
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getMarca() {
        return marca;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void mostrarInformacion() {
        System.out.println("Marca: " + marca + ", Velocidad Maxima: " + velocidadMaxima);
    }
}
