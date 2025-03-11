package Activdad14U12.actv1;

import java.io.*;

public class PersistenciaLibro {
    public void guardarLibro(Libro libro, String archivo) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivo))) {
            writer.write(libro.getTitulo() + "," + libro.getAutor() + "," + libro.getIsbn() + "," + libro.getPaginas());
        }
    }

    public Libro cargarLibro(String archivo) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
            String linea = reader.readLine();
            String[] datos = linea.split(",");
            return new Libro(datos[0], datos[1], datos[2], Integer.parseInt(datos[3]));
        }
    }
}
