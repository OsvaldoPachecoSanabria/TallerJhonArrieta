package Actividad16U14.actv3;

public class Transporte {
    private String marca;
    private String modelo;

    public Transporte(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

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

    public void mover() {
        System.out.println("El transporte se está moviendo.");
    }
}

class Bicicleta extends Transporte {
    private int numeroDeMarchas;

    public Bicicleta(String marca, String modelo, int numeroDeMarchas) {
        super(marca, modelo);
        this.numeroDeMarchas = numeroDeMarchas;
    }

    public int getNumeroDeMarchas() {
        return numeroDeMarchas;
    }

    public void setNumeroDeMarchas(int numeroDeMarchas) {
        this.numeroDeMarchas = numeroDeMarchas;
    }

    @Override
    public void mover() {
        System.out.println("La bicicleta se está moviendo.");
    }
}

class Coche extends Transporte {
    private int numeroDePuertas;

    public Coche(String marca, String modelo, int numeroDePuertas) {
        super(marca, modelo);
        this.numeroDePuertas = numeroDePuertas;
    }

    public int getNumeroDePuertas() {
        return numeroDePuertas;
    }

    public void setNumeroDePuertas(int numeroDePuertas) {
        this.numeroDePuertas = numeroDePuertas;
    }

    @Override
    public void mover() {
        System.out.println("El coche se está moviendo.");
    }
}
