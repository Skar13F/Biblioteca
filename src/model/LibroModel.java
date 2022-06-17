/* Autor: Oscar Fuentes Alvarado
 * Fecha de creación: 25 de abril de 2022
 * Fecha de actualización: 17 de junio de 2022
 * Descripción: clase para modelar las operaciones CRUD de la clase Libro
 */
package model;

import java.util.List;
import javax.swing.table.DefaultTableModel;

import pojo.Libro;

public class LibroModel {

    // Método para agregar objetos a la lista de  libros
    public List<Libro> crearLibro(List<Libro> lista, Libro libro) {
        lista.add(libro);
        return lista;

    }

    // Método para eliminar un objeto libro de la lista
    public List<Libro> eliminarLibro(List<Libro> lista, String isbn) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getIsbn().compareTo(isbn) == 0) {
                lista.remove(i);
                break;
            }
        }
        return lista;
    }

    //Método para buscar un objeto en la lista, retorna nulo si no lo encuentra
    public Libro getLibro(List<Libro> lista, String isbn) {
        Libro vacio = null;
        for (Libro libro : lista) {
            if (isbn.compareTo(libro.getIsbn()) == 0) {
                return libro;
            }
        }
        return vacio;
    }

    // Método para actualizar datos de un  objeto en la lista
    public List<Libro> actualizarLibro(List<Libro> lista, Libro libro1) {										// de un libro
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getIsbn().compareTo(libro1.getIsbn()) == 0) {
                lista.set(i, libro1);
                break;
            }
        }
        return lista;
    }

    // Método para mostrar el contenido de la lista en una tabla
    public void mostrarlibro(List<Libro> lista, DefaultTableModel modelo) {
        modelo.setRowCount(0);//resetea la tabla
        for (int i = 0; i < lista.size(); i++) {
            //Objeto fila para obtener los datos se mostrará
            Object[] fila = new Object[5];
            fila[0] = lista.get(i).getIsbn();
            fila[1] = lista.get(i).getTitulo();
            fila[2] = lista.get(i).getAutor();
            fila[3] = lista.get(i).getClasificacion();
            fila[4] = lista.get(i).getCantidad();
            modelo.addRow(fila);//Añadimos la fila a la tabla
        }
    }
}
