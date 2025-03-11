package Actividad15U13.actv1;

public class DescuentoFijo extends Descuento {
    private double cantidadFija;

    public DescuentoFijo(double cantidadFija) {
        this.cantidadFija = cantidadFija;
    }

    @Override
    public double aplicarDescuento(double precio) {
        return precio - cantidadFija;
    }
}