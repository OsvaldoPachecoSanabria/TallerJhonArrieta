package Actividad15U13.actv2;

public class Main {
    public static void main(String[] args) {
        Documento documento = new Documento();

        // Exportar a PDF
        documento.setExportStrategy(new PDFExportStrategy());
        documento.export();

        // Exportar a Word
        documento.setExportStrategy(new WordExportStrategy());
        documento.export();

        // Exportar a Excel
        // no sabria como hacerla lo eh intentado de muchas formas no me funciona
    }
}