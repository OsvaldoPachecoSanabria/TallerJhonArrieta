package actividad10.actv10UNO;

public class Pez extends Animal {
    private String tipoAgua;

    public Pez(String especie, String tipoAgua) {
        super(especie);
        this.tipoAgua = tipoAgua;
    }

    public void mostrarTipoAgua() {
        System.out.println("Tipo de agua: " + tipoAgua);
    }

    @Override
    public void mostrarEspecie() {
        super.mostrarEspecie();
        System.out.println("Tipo especie: " + tipoAgua);
    }
}
