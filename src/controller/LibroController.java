/* Autor: Oscar Fuentes Alvarado
 * Fecha de creación: 28 de abril de 2022
 * Fecha de actualización: 09 de junio de 2022
 * Descripción: clase para responder a las interacciones entre el usuario y 
 * 				la interfaz, y realiza las peticiones al modelo
                                para pasarlos a la vista
 */
package controller;

import java.util.List;
import javax.swing.table.DefaultTableModel;

import model.LibroModel;
import pojo.Libro;

public class LibroController {

    private static LibroModel lib = new LibroModel();

    public List<Libro> crearLibro(List<Libro> lista, Libro libro) {// Agregar
        return lib.crearLibro(lista, libro);
    }

    public Libro getLibro(List<Libro> lista, String isbn) {// Buscar
        return lib.getLibro(lista, isbn);
    }

    public List<Libro> eliminarLibro(List<Libro> lista, String isbn) {// Eliminar
        return lib.eliminarLibro(lista, isbn);
    }

    public void mostrarlibro(List<Libro> lista, DefaultTableModel modelo) {// Mostrar
        lib.mostrarlibro(lista, modelo);
    }

    public List<Libro> actualizarLibro(List<Libro> lista, Libro libro) {// Actualizar
        return lib.actualizarLibro(lista, libro);
    }
}
