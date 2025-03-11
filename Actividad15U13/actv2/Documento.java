package Actividad15U13.actv2;

public class Documento {
    private ExportStrategy exportStrategy;

    public void setExportStrategy(ExportStrategy exportStrategy) {
        this.exportStrategy = exportStrategy;
    }

    public void export() {
        if (exportStrategy != null) {
            exportStrategy.export(this);
        } else {
            System.out.println("No se ha definido una estrategia de exportación");
        }
    }
}
