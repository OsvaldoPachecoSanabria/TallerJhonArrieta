package actividad4.ejercicio2;

public class Coche {
    private String marca;
    private String modelo;
    private double velocidadMaxima;

    // Getters and Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    // metodo para acelerar
    public void acelerar(double incremento) {
        if (incremento > 0) {
            this.velocidadMaxima += incremento;
        } else {
            // si el incremento es negativo (validacion)
            System.out.println("El incremento debe ser positivo");
        }
    }
}
