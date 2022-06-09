/* Autor: Oscar Fuentes Alvarado
 * Fecha de creación: 25 de abril de 2022
 * Fecha de actualización: 06 de junio de 2022
 * Descripción: clase para modelar las operaciones CRUD de la clase Libro
 */
package model;

import java.util.List;
import javax.swing.table.DefaultTableModel;

import pojo.Libro;

public class LibroModel {

    public List<Libro> crearLibro(List<Libro> lista, Libro libro) {// Agrega objetos a la lista
        lista.add(libro);
        return lista;

    }

    public Libro getLibro(List<Libro> lista, String isbn) {// Busca un objeto libro en la lista
        Libro vacio = null;
        for (Libro libro : lista) {
            if (isbn.compareTo(libro.getIsbn()) == 0) {
                return libro;
            }
        }
        return vacio;
    }

    public List<Libro> eliminarLibro(List<Libro> lista, String isbn) {// Busca y elimina un objeto
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getIsbn().compareTo(isbn) == 0) {
                lista.remove(i);
                break;
            }
        }
        return lista;
    }

    public void mostrarlibro(List<Libro> lista, DefaultTableModel modelo) {// Imprime el contenido de la lista
        modelo.setRowCount(0);//resetea la tabla
        for (int i = 0; i < lista.size(); i++) {
            Object[] fila = new Object[5];
            fila[0] = lista.get(i).getIsbn();
            fila[1] = lista.get(i).getTitulo();
            fila[2] = lista.get(i).getAutor();
            fila[3] = lista.get(i).getClasificacion();
            fila[4] = lista.get(i).getCantidad();
            modelo.addRow(fila);
        }
    }

    public List<Libro> actualizarLibro(List<Libro> lista, Libro libro1) {// Actualiza los datos															// de un libro
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getIsbn().compareTo(libro1.getIsbn()) == 0) {
                lista.set(i, libro1);
                break;
            }
        }
        return lista;
    }
}
