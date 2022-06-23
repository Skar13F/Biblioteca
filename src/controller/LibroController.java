/**
 * Autor: Oscar Fuentes Alvarado
 * Fecha de creación: 28 de abril de 2022
 * Fecha de actualización: 09 de junio de 2022
 * Descripción: clase para responder a las interacciones entre el usuario y
 * 				la interfaz, y realiza las peticiones al modelo
 * para pasarlos a la vista
 */
package controller;

import java.util.List;
import javax.swing.table.DefaultTableModel;

import model.LibroModel;
import pojo.Libro;

public class LibroController {

    private static LibroModel lib = new LibroModel();

    /**
     * Método para añadir datos a la lista
     */
    public List<Libro> crearLibro(List<Libro> lista, Libro libro) {
        return lib.crearLibro(lista, libro);
    }

    /**
     * Método para eliminar datos de la lista
     */
    public List<Libro> eliminarLibro(List<Libro> lista, String isbn) {
        return lib.eliminarLibro(lista, isbn);
    }

    /**
     * Método para buscar un objeto en la lista
     */
    public Libro getLibro(List<Libro> lista, String isbn) {
        return lib.getLibro(lista, isbn);
    }

    /**
     * Método para actualizar datos de un objeto
     */
    public List<Libro> actualizarLibro(List<Libro> lista, Libro libro) {
        return lib.actualizarLibro(lista, libro);
    }

    /**
     * Método para mostrar (imprimir) los datos de la lista en una tabla
     */
    public void mostrarlibro(List<Libro> lista, DefaultTableModel modelo) {
        lib.mostrarlibro(lista, modelo);
    }
}
