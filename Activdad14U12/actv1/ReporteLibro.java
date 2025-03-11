package Activdad14U12.actv1;

public class ReporteLibro {
    public String generarReporte(Libro libro) {
        return "Título: " + libro.getTitulo() + "\n" +
                "Autor: " + libro.getAutor() + "\n" +
                "ISBN: " + libro.getIsbn() + "\n" +
                "Páginas: " + libro.getPaginas();
    }
}
